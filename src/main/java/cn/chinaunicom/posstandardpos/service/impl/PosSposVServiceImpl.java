package cn.chinaunicom.posstandardpos.service.impl;

import cn.chinaunicom.posstandardpos.entity.PosSposV;
import cn.chinaunicom.posstandardpos.dao.PosSposVMapper;
import cn.chinaunicom.posstandardpos.service.PosSposVService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-22
 */
@Service
public class PosSposVServiceImpl extends HrServiceImpl<PosSposVMapper, PosSposV> implements PosSposVService {

	@Autowired
	PosSposVMapper mapper;
	
	@Override
	public List<PosSposV> getPosSposVList() {
		return mapper.selectList(new EntityWrapper<PosSposV>().eq("1", "1"));
	}

	@Override
	public Integer savePosSposV(PosSposV entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updatePosSposV(PosSposV entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deletePosSposV(Long id) {
		return mapper.deleteById(id);
	}

	@Override
	public Integer searchProvincePostListCount(HashMap<Object, Object> params) {
		return mapper.searchProvincePostListCount(params);
	}
}
