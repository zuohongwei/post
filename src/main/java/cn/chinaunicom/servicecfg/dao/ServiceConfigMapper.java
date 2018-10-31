package cn.chinaunicom.servicecfg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import cn.chinaunicom.platform.dao.HrBaseMapper;
import cn.chinaunicom.servicecfg.entity.ServiceConfig;

/**
 * **************************************
 * 描述: 服务管理mapper 
 * @ClassName: cn.chinaunicom.servercfg.dao.ServerConfigMapper 
 * @author zuohongwei 
 * @version V1.0
***************************************
 */
@Repository
@Mapper
public interface ServiceConfigMapper extends HrBaseMapper<ServiceConfig> {

	/**
	 * 
	*描述: 根据模块名获取服务注册信息 
	*@param module
	*@return List<ServerConfig>
	 */
	List<ServiceConfig> getByModle(String module);
}
