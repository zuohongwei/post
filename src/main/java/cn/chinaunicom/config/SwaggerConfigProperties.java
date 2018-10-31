package cn.chinaunicom.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * **************************************
 * 描述: Swagger参数实体类
 * @ClassName: cn.chinaunicom.config.SwaggerConfigProperties 
 * @author zuohongwei 
 * @version V1.0
***************************************
 */
@ConfigurationProperties(prefix = "sop.swagger")
@Component
public class SwaggerConfigProperties implements Serializable  {

    private static final long serialVersionUID = 1858143581121628601L;

    private Boolean enable;

    private String packageScan;

    private String title;

    private String description;

    private String version;

    private String host;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getPackageScan() {
        return packageScan;
    }

    public void setPackageScan(String packageScan) {
        this.packageScan = packageScan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
