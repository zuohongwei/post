package cn.chinaunicom.posstandardpos.service.impl;

import cn.chinaunicom.posstandardpos.dao.PosTreeVMapper;
import cn.chinaunicom.posstandardpos.entity.PosTreeV;
import cn.chinaunicom.posstandardpos.service.PosTreeVService;
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

	@Override
	public List<PosTreeV> getMListById(String posId) {
		return mapper.getMListById(posId);
	}

	@Override
	public List<PosTreeV> getKListByMId(Long mid, String posId) {
		HashMap<Object, Object> objectHashMap = new HashMap<>();
		objectHashMap.put("mid",mid);
		objectHashMap.put("posId",posId);
		return mapper.getKListByMId(objectHashMap);
	}

	@Override
	public List<PosTreeV> getSkListByKId(Long kid, String posId) {
		HashMap<Object, Object> objectHashMap = new HashMap<>();
		objectHashMap.put("kid",kid);
		objectHashMap.put("posId",posId);
		return mapper.getSkListByKId(objectHashMap);
	}

	@Override
	public List<PosTreeV> getKListsByMId(List<Object> objec, String posId) {
		return mapper.getKListsByMId(objec,posId);
	}

	@Override
	public List<PosTreeV> getSkListsByKId(List<Object> objec2, String posId) {
		return mapper.getSkListsByKId(objec2,posId);
	}
}
