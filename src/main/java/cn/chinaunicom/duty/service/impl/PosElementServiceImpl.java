<<<<<<< HEAD
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
	public List<PosElement> getElementList(Integer versionId) {
		return mapper.getElementList(versionId);
	}

	@Override
	public List<PosElement> getSubList(@Param("versionId") Integer versionId, @Param("posCateId") Integer posCateId) {
		return mapper.getSubList(versionId, posCateId);
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
	public List<PosElement> getCateList() {
		return mapper.getCateList();
	}
}
=======
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
	public List<PosElement> getElementList(Integer versionId) {
		return mapper.getElementList(versionId);
	}

	@Override
	public List<PosElement> getSubList(@Param("versionId") Integer versionId, @Param("posCateId") Integer posCateId) {
		return mapper.getSubList(versionId, posCateId);
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

}
>>>>>>> d434f8f24b916e3617f1162e10460561f9c4790b
