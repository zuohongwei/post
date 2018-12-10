package cn.chinaunicom.duty.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinaunicom.duty.dao.PosElementStructureMapper;
import cn.chinaunicom.duty.entity.PosElementStructure;
import cn.chinaunicom.duty.service.PosElementStructureService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-02
 */
@Service
public class PosElementStructureServiceImpl extends HrServiceImpl<PosElementStructureMapper, PosElementStructure> implements PosElementStructureService {

	@Autowired
	PosElementStructureMapper mapper;

	@Override
	public int createElementStructureInfo(List<PosElementStructure>list) {
		return mapper.createElementStructureInfo(list);
	}

	@Override
	public List<PosElementStructure> getParentInfo(@Param("elementIdParent") String elementIdParent, @Param("versionId") String versionId) {
		return mapper.getParentInfo(elementIdParent,versionId);
	}


}
