package cn.chinaunicom.PosStandardpos.service;

import cn.chinaunicom.PosStandardpos.entity.PosTreeV;
import cn.chinaunicom.platform.service.IHrService;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-09
 */
public interface PosTreeVService extends IHrService<PosTreeV> {

	public List<PosTreeV> getPosTreeVList();
	
	public Integer savePosTreeV(PosTreeV entity);
	
	public Integer updatePosTreeV(PosTreeV entity);
	
	public Integer deletePosTreeV(Long id);

    List<PosTreeV> getSubcateList(HashMap<Object, Object> params);
}
