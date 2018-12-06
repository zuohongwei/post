package cn.chinaunicom.duty.service;

import cn.chinaunicom.duty.entity.AuthCtrlValue;
import cn.chinaunicom.platform.service.IHrService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-29
 */
public interface AuthCtrlValueService extends IHrService<AuthCtrlValue> {

	String getTopId(@Param("login_name") String login_name, @Param("respId") String resp_id);
}
