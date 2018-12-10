package cn.chinaunicom.PosStandardpos.service.impl;

import cn.chinaunicom.PosStandardpos.dao.PosTreeVMapper;
import cn.chinaunicom.PosStandardpos.entity.PosTreeV;
import cn.chinaunicom.PosStandardpos.service.PosTreeVService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-09
 */
@Service
public class PosTreeVServiceImpl extends HrServiceImpl<PosTreeVMapper, PosTreeV> implements PosTreeVService {

	@Autowired
    PosTreeVMapper mapper;
	
	@Override
	public List<PosTreeV> getPosTreeVList() {
		return mapper.selectList(new EntityWrapper<PosTreeV>().eq("1", "1"));
	}

	@Override
	public Integer savePosTreeV(PosTreeV entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updatePosTreeV(PosTreeV entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deletePosTreeV(Long id) {
		return mapper.deleteById(id);
	}

	@Override
	public List<PosTreeV> getSubcateList(HashMap<Object, Object> params) {
		return mapper.getSubcateList(params);
	}
}
