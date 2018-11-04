package cn.chinaunicom.interceptor;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.chinaunicom.platform.utils.Constant;
import cn.chinaunicom.servicecfg.entity.ServiceConfig;
import cn.chinaunicom.servicecfg.service.ServiceConfigService;

/**
 * **************************************
 * 描述: 服务注册拦截器
 * 开发的服务前缀为Constant.SERVER_PREFIX，必须在hr_server_config中注册才允许访问
 * @ClassName: cn.chinaunicom.interceptor.ServerConfigInterceptor 
 * @author zuohongwei 
 * @version V1.0
***************************************
 */
@Component
public class ServerConfigInterceptor implements HandlerInterceptor{

	@Autowired
	ServiceConfigService service;
	
	HashMap<String, String> serverMap = new HashMap<String, String>();
	
	HashMap<String, String> withoutAuthorityUrls = new HashMap<String, String>();
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String path = request.getRequestURI();
		if(path.startsWith(Constant.SERVER_PREFIX)) {
			if(withoutAuthorityUrls.isEmpty()){
				initWithoutAuthorityUrls();
			}
			if(withoutAuthorityUrls.containsValue(path)){
				return true;
			}
			if(serverMap.size()==0) {
				initServerMap();
			}
			String[] split = path.split("/");
			if(null != split && split.length>4){
				path = "/"+split[1]+"/"+split[2]+"/"+split[3];
			}
			if(serverMap.containsKey(path)) {
				return true;
			}else {
				 response.setContentType("text/json");
	             response.setCharacterEncoding("UTF-8");
	             response.getWriter().write("{\"status\":404, \"msg\":\"服务未注册！\", \"data\": [], \"count\": 0}");
	             return false;
			}
		}else {
			return true;
		}
	}
	
	public void initServerMap() {
		List<ServiceConfig> selectByModule = service.getByModule(Constant.MODULE);
		if(selectByModule.size()>0) {
			for (ServiceConfig serverConfig : selectByModule) {
				serverMap.put(serverConfig.getUrl(), "");
			}
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public void initWithoutAuthorityUrls(){
		withoutAuthorityUrls.put("/api/menuitemReg/menulist", "/api/menuitemReg/menulist");
	}

}
