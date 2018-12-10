package cn.chinaunicom.duty.dao;

import cn.chinaunicom.duty.entity.AuthCtrlValue;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-29
 */
public interface AuthCtrlValueMapper extends HrBaseMapper<AuthCtrlValue> {
    /**
     *
     * 描述: 获取顶级id
     *
     * @param login_name
     * @param resp_id
     * @return String
     */
    String getTopId(@Param("login_name") String login_name, @Param("respId") String resp_id);

}
