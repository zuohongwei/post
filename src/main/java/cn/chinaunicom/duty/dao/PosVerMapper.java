package cn.chinaunicom.duty.dao;

import java.util.List;

import cn.chinaunicom.duty.entity.PosVer;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-01
 */
public interface PosVerMapper extends HrBaseMapper<PosVer> {

	PosVer getVersion();

	List<PosVer> getVersionList();

}
