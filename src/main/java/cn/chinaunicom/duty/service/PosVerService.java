package cn.chinaunicom.duty.service;

import cn.chinaunicom.duty.entity.PosVer;
import cn.chinaunicom.platform.service.IHrService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-01
 */
public interface PosVerService extends IHrService<PosVer> {

	PosVer getVersion();

}
