package cn.chinaunicom.posstandardpos.service.impl;

import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import cn.chinaunicom.posstandardpos.dao.LookupsMapper;
import cn.chinaunicom.posstandardpos.entity.Lookups;
import cn.chinaunicom.posstandardpos.service.LookupsService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 值集信息表 服务实现类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-08
 */
@Service
public class LookupsServiceImpl extends HrServiceImpl<LookupsMapper, Lookups> implements LookupsService {

	@Autowired
	LookupsMapper mapper;
	
	@Override
	public List<Lookups> getLookupsList() {
		return mapper.selectList(new EntityWrapper<Lookups>().eq("1", "1"));
	}

	@Override
	public Integer saveLookups(Lookups entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updateLookups(Lookups entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deleteLookups(Long id) {
		return mapper.deleteById(id);
	}

	@Override
	public List<Lookups> findTypeItemInfos(String lookupType) {

		return mapper.findTypeItemInfos(lookupType);
	}
}
