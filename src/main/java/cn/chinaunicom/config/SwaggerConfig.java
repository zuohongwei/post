package cn.chinaunicom.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * **************************************
 * 描述: Swagger设置 
 * @ClassName: cn.chinaunicom.config.SwaggerConfig 
 * @author zuohongwei 
 * @version V1.0
***************************************
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    private SwaggerConfigProperties scp;

    @Bean
    public Docket createDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(scp.getEnable())
                .apiInfo(apiInfo())
                .host(scp.getHost())
                .select()
                .apis(RequestHandlerSelectors.basePackage(scp.getPackageScan()))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(scp.getTitle())
                .description(scp.getDescription())
                .version(scp.getVersion())
                .build();
    }

}