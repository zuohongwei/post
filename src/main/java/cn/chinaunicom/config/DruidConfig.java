package cn.chinaunicom.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/**
 * ************************************** 
 * 描述: Druid设置
 * @ClassName: cn.chinaunicom.config.DruidConfig
 * @author zuohongwei
 * @version V1.0
 ***************************************
 */
@Configuration
public class DruidConfig {
	
	/**
	 * 
	*描述: Servlet设置
	*@return ServletRegistrationBean
	 */
	@Bean
	public ServletRegistrationBean druidServlet() { // 主要实现WEB监控的配置处理
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*"); // 现在要进行druid监控的配置处理操作
		// servletRegistrationBean.addInitParameter("allow","127.0.0.1,192.168.1.159");
		// // 白名单
		// servletRegistrationBean.addInitParameter("deny", "192.168.1.200"); //
		// 黑名单
		servletRegistrationBean.addInitParameter("loginUsername", "druid"); // 用户名
		servletRegistrationBean.addInitParameter("loginPassword", "druid"); // 密码
		servletRegistrationBean.addInitParameter("resetEnable", "false"); // 是否可以重置数据源
		return servletRegistrationBean;
	}

	/**
	 * 
	*描述: filter设置 
	*@return FilterRegistrationBean
	 */
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*"); // 所有请求进行监控处理
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.css,/druid/*");
		return filterRegistrationBean;
	}

	/**
	 * DataSource设置
	*描述: （请描述该方法功能） 
	*@return DataSource
	 */
	@Bean
	@ConfigurationProperties(
			prefix = "spring.datasource")
	public DataSource druidDataSource() {
		return new DruidDataSource();
	}
}