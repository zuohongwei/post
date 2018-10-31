package cn.chinaunicom.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;

/**
 * **************************************
 * 描述: Mybatis设置
 * @ClassName: cn.chinaunicom.config.MybatisPlusConfig 
 * @author zuohongwei 
 * @version V1.0
***************************************
 */
@EnableTransactionManagement
@Configuration
@MapperScan("cn.chinaunicom.**.dao")
public class MybatisPlusConfig {

    /**
     * mybatis-plus SQL执行效率插件【生产环境可以关闭】
     */
    @Bean
    @Profile({"dev", "test"})
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * mybatis-plus分页插件<br>
     * 文档：http://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
    
}

