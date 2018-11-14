package cn.chinaunicom.menu.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 菜单注册
 * </p>
 *
 * @author zuohongwei
 * @since 2018-09-19
 */
@TableName("hr_menuitem_reg")
@ApiModel("菜单注册")
public class MenuItemReg extends Model<MenuItemReg> {

    private static final long serialVersionUID = 1L;

    private Long id;
    
    private Long pid;
    /**
     * 节点编码
     */
     @ApiModelProperty(value="节点编码")
    private String funcode;
    /**
     * 菜单名称
     */
     @ApiModelProperty(value="菜单名称")
    private String name;
    /**
     * 菜单编码
     */
     @ApiModelProperty(value="菜单编码")
    private String code;
    /**
     * 描述
     */
     @ApiModelProperty(value="描述")
    private String description;
    /**
     * 所属模块
     */
     @ApiModelProperty(value="所属模块")
    private String module;
     /**
      * 图标
      */
      @ApiModelProperty(value="图标")
    private String iconurl;

    public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getIconUrl() {
		return iconurl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconurl = iconUrl;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuncode() {
        return funcode;
    }

    public void setFuncode(String funcode) {
        this.funcode = funcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "MenuitemReg{" +
        ", id=" + id +
        ", funcode=" + funcode +
        ", name=" + name +
        ", code=" + code +
        ", description=" + description +
        ", module=" + module +
        "}";
    }
}
