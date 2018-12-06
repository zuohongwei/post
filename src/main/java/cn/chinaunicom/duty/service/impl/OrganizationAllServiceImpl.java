package cn.chinaunicom.duty.service.impl;

import cn.chinaunicom.duty.entity.OrganizationAll;
import cn.chinaunicom.duty.dao.OrganizationAllMapper;
import cn.chinaunicom.duty.service.OrganizationAllService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 * 组织信息表 服务实现类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-29
 */
@Service
public class OrganizationAllServiceImpl extends HrServiceImpl<OrganizationAllMapper, OrganizationAll> implements OrganizationAllService {

	@Autowired
	OrganizationAllMapper mapper;


	@Override
	public Map<String,Object> getTop(@Param("organizationId")String topId) {
		return mapper.getTop(topId);
	}

	@Override
	public List<OrganizationAll> getSub(@Param("organizationId")String topId) {
		return mapper.getSub(topId);
	}

	@Override
	public List<String> getAllIds(String topId) {
		Map<String,Object> map = new HashMap<>();
		ArrayList<String> idList = new ArrayList<String>();
		ArrayList<String> idListPlus = new ArrayList<String>();
		idListPlus.add(topId);
		idList.add(topId);
		map.put("ids",idList);
		List<String> ids = mapper.getAllIds(map);
		idListPlus.addAll(ids);
		if(ids.size()>0){
			setChildrenList(map,ids,idListPlus);
		}
		return idListPlus;
	}
	private void setChildrenList(Map<String,Object>map,List<String>ids,ArrayList<String>idListPlus){

		map.put("ids",ids);
		List<String> idsPlus = mapper.getAllIds(map);
		idListPlus.addAll(idsPlus);
		if(idsPlus.size()>0){
			setChildrenList(map,idsPlus,idListPlus);
		}
	}
}
