package cn.chinaunicom.posstandardpos.dao;

import cn.chinaunicom.platform.dao.HrBaseMapper;
import cn.chinaunicom.posstandardpos.entity.Lookups;

import java.util.List;
import java.util.Map;

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

    List<Map<String, String>> findPosEducationDegree(String ehrcuc_pos_education_degree);
}
