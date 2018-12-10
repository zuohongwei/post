package cn.chinaunicom.posstandardpos.service;

import cn.chinaunicom.posstandardpos.entity.PosSposV;
import cn.chinaunicom.platform.service.IHrService;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-22
 */
public interface PosSposVService extends IHrService<PosSposV> {

	public List<PosSposV> getPosSposVList();
	
	public Integer savePosSposV(PosSposV entity);
	
	public Integer updatePosSposV(PosSposV entity);
	
	public Integer deletePosSposV(Long id);

	Integer searchProvincePostListCount(HashMap<Object, Object> params);
}
