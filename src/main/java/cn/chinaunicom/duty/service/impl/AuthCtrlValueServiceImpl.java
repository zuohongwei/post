package cn.chinaunicom.duty.service.impl;

import cn.chinaunicom.duty.entity.AuthCtrlValue;
import cn.chinaunicom.duty.dao.AuthCtrlValueMapper;
import cn.chinaunicom.duty.service.AuthCtrlValueService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-29
 */
@Service
public class AuthCtrlValueServiceImpl extends HrServiceImpl<AuthCtrlValueMapper, AuthCtrlValue> implements AuthCtrlValueService {

	@Autowired
	AuthCtrlValueMapper mapper;


	@Override
	public String getTopId(@Param("login_name") String login_name, @Param("respId") String resp_id) {
		return mapper.getTopId(login_name, resp_id);
	}

}
