package cn.chinaunicom.posstandardpos.dao;

import cn.chinaunicom.posstandardpos.entity.PosSposV;
import cn.chinaunicom.platform.dao.HrBaseMapper;

import java.util.HashMap;

/**
 * <p>
 * VIEW Mapper 接口
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-22
 */
public interface PosSposVMapper extends HrBaseMapper<PosSposV> {

    Integer searchProvincePostListCount(HashMap<Object, Object> params);
}
