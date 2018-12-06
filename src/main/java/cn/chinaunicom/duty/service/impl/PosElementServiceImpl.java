package cn.chinaunicom.duty.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.duty.dao.PosElementMapper;
import cn.chinaunicom.duty.entity.PosElement;
import cn.chinaunicom.duty.entity.PosElementEmp;
import cn.chinaunicom.duty.service.PosElementService;
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
public class PosElementServiceImpl extends HrServiceImpl<PosElementMapper, PosElement> implements PosElementService {

	@Autowired
	PosElementMapper mapper;

	@Override
	public List<PosElement> getElementList(@Param("versionId")String versionId,@Param("elementType")String elementType,@Param("posCateId")String posCateId) {
		return mapper.getElementList(versionId,elementType,posCateId);
	}



	@Override
	public List<PosElement> getPosElementPagList(Page<PosElement> objectPage, Map<String, Object> params) {
		return mapper.getPosElementPagList(objectPage, params);
	}

	@Override
	public List<PosElementEmp> getPosElementPagList(Map<String, Object> params) {
		return mapper.getPosElementPagList(params);
	}

	@Override
	public Integer getPosElementPagListCount(Map<String, Object> params) {
		return mapper.getPosElementPagListCount(params);
	}

	@Override
	public List<String> getIds(String elementName) {
		return mapper.getIds(elementName);
	}

	@Override
	public Integer updateElementInfo(List<PosElement> list) {
		return mapper.updateElementInfo(list);
	}

	@Override
	public List<PosElement> getDutyList() {
		return mapper.getDutyList();
	}


}
