package cn.chinaunicom.servicecfg.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zuohongwei
 * @since 2018-09-12
 */
@TableName("hr_server_config")
@ApiModel("服务管理")
public class ServiceConfig extends Model<ServiceConfig> {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 服务路径
     */
    @ApiModelProperty("服务路径")
    private String url;
    /**
     * 服务名称
     */
    @ApiModelProperty("服务名称")
    private String name;
    /**
     * 模块名
     */
    @ApiModelProperty("模块名")
    private String module;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Serverconfig{" +
        ", id=" + id +
        ", url=" + url +
        ", name=" + name +
        ", module=" + module +
        "}";
    }
}
