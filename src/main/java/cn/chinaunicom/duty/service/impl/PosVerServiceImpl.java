package cn.chinaunicom.duty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaunicom.duty.dao.PosVerMapper;
import cn.chinaunicom.duty.entity.PosVer;
import cn.chinaunicom.duty.service.PosVerService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-01
 */
@Service
public class PosVerServiceImpl extends HrServiceImpl<PosVerMapper, PosVer> implements PosVerService {

	@Autowired
	PosVerMapper mapper;

	@Override
	public PosVer getVersion() {
		return mapper.getVersion();
	}

	@Override
	public List<PosVer> getVersionList() {
		return mapper.getVersionList();
	}

}
