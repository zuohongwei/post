package cn.chinaunicom.posstandardpos.service;

import cn.chinaunicom.platform.service.IHrService;
import cn.chinaunicom.posstandardpos.entity.Lookups;

import java.util.List;

/**
 * <p>
 * 值集信息表 服务类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-08
 */
public interface LookupsService extends IHrService<Lookups> {

	public List<Lookups> getLookupsList();

	public Integer saveLookups(Lookups entity);

	public Integer updateLookups(Lookups entity);

	public Integer deleteLookups(Long id);

	List<Lookups> findTypeItemInfos(String lookupType);
}

