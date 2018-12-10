package cn.chinaunicom.duty.dao;

import cn.chinaunicom.duty.entity.PosPosdes;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 岗位说明书 Mapper 接口
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-28
 */
public interface PosPosdesMapper extends HrBaseMapper<PosPosdes> {

    List<Map<String,Object>> getList(Page<PosPosdes> page, Map<String,Object>map);

    Integer getCount(Map<String,Object>map);

    List<Map<String,Object>>selectPosKeyElement(Page<PosPosdes> page,Map<String,Object>map);

    List<Map<String,Object>> selectProfessionList();
    Integer  selectPosKeyElementCount(Map<String,Object>map);

    Map<String,Object>selectInstructions(Map<String,Object>map);
    List<Map<String,Object>> searchKeyMap(Map<String,Object>map);

}
