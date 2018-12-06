package cn.chinaunicom.PosStandardpos.dao;

import cn.chinaunicom.PosStandardpos.entity.Lookups;
import cn.chinaunicom.platform.dao.HrBaseMapper;

import java.util.List;

/**
 * <p>
 * 值集信息表 Mapper 接口
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-08
 */
public interface LookupsMapper extends HrBaseMapper<Lookups> {

    List<Lookups> findTypeItemInfos(String lookupType);
}
