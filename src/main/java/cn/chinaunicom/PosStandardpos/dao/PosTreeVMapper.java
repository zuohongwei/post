package cn.chinaunicom.PosStandardpos.dao;

import cn.chinaunicom.PosStandardpos.entity.PosTreeV;
import cn.chinaunicom.platform.dao.HrBaseMapper;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * VIEW Mapper 接口
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-09
 */
public interface PosTreeVMapper extends HrBaseMapper<PosTreeV> {

    List<PosTreeV> getSubcateList(HashMap<Object, Object> params);
}
