package cn.chinaunicom.servicecfg.service;

import java.util.List;

import cn.chinaunicom.platform.service.IHrService;
import cn.chinaunicom.servicecfg.entity.ServiceConfig;

/**
 * **************************************
 * 描述: 服务管理
 * @ClassName: cn.chinaunicom.servercfg.service.ServerConfigService 
 * @author zuohongwei 
 * @version V1.0
***************************************
 */
public interface ServiceConfigService extends IHrService<ServiceConfig> {

	/**
	 * 
	*描述: 根据模块名获取服务注册信息
	*@param module
	*@return List<ServerConfig>
	 */
	public List<ServiceConfig> getByModule(String module);
	
	/**
	 * 
	*描述: 保存服务注册信息
	*@param entity
	*@return Integer
	 */
	public Integer saveServer(ServiceConfig entity);
}
