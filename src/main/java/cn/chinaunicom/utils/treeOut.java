package cn.chinaunicom.utils;

import cn.chinaunicom.posstandardpos.entity.PosTreeV;
import cn.chinaunicom.posstandardpos.service.*;
import cn.chinaunicom.duty.service.PosElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author MR.zhang_ccc on 2018-11-22.
 * @version 1.0
 */
@Component
public class treeOut {
    @Autowired
    PosJposVService service;

    @Autowired
    PosElementService posElementService;
    @Autowired
    PosTreeVService posTreeVService;
    @Autowired
    PosPosElementService posPosElementService;
    @Autowired
    PosStandardposService posStandardposService;
    @Autowired
    PosSposVService posSposVService;
    public  void   setChildrenList (Map<String, Object> params, List<PosTreeV> kList,List<PosTreeV> mList){

        HashMap<Long, List<PosTreeV>> map = new HashMap<Long, List<PosTreeV>>();
        for (PosTreeV org : kList)
        {
            Long mid = org.getMid();
            if (null == map.get(mid))
            {
                ArrayList<PosTreeV> list2 = new ArrayList<PosTreeV>();
                list2.add(org);
                map.put(mid, list2);
            } else
            {
                map.get(mid).add(org);
            }
        }
        for (PosTreeV orgTree : mList)
        {
            orgTree.setkList(map.get(orgTree.getMid()));
        }
        setChildrenList(params, mList,null);}
}
