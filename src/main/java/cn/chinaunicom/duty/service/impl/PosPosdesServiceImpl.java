package cn.chinaunicom.duty.service.impl;

import cn.chinaunicom.duty.entity.PosPosdes;
import cn.chinaunicom.duty.dao.PosPosdesMapper;
import cn.chinaunicom.duty.service.PosPosdesService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 * 岗位说明书 服务实现类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-28
 */
@Service
public class PosPosdesServiceImpl extends HrServiceImpl<PosPosdesMapper, PosPosdes> implements PosPosdesService {

	@Autowired
	PosPosdesMapper mapper;


	@Override
	public List<Map<String,Object>>getList(Page<PosPosdes> page, Map<String, Object> map) {
		return mapper.getList(page,map);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		return mapper.getCount(map);
	}

	@Override
	public List<Map<String, Object>> selectPosKeyElement(Page<PosPosdes> page, Map<String, Object> map) {
		return mapper.selectPosKeyElement(page,map);
	}

	@Override
	public List<Map<String, Object>> selectProfessionList() {
		return mapper.selectProfessionList();
	}

	@Override
	public Integer selectPosKeyElementCount(Map<String, Object> map) {
		return mapper.selectPosKeyElementCount(map);
	}
}
