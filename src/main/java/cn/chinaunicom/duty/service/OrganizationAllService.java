package cn.chinaunicom.duty.service;

import cn.chinaunicom.duty.entity.OrganizationAll;
import cn.chinaunicom.platform.service.IHrService;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 组织信息表 服务类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-29
 */
public interface OrganizationAllService extends IHrService<OrganizationAll> {

	Map<String,Object> getTop(@Param("organizationId")String topId);

	List<OrganizationAll> getSub(@Param("organizationId")String topId);

	List<String>getAllIds(String topId);
	
}
