package cn.chinaunicom.menu.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;

/**
 * <p>
 * 菜单注册
 * </p>
 *
 * @author zuohongwei
 * @since 2018-09-19
 */
public class MenuList extends Model<MenuList> {

    private static final long serialVersionUID = 1L;

    private Long id;
    
    private Long pid;
    
    private String menuName;

    private String url;
    
    private String iconUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	@Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "MenuList{" +
        ", id=" + id +
        ", pid=" + pid +
        ", menuName=" + menuName +
        ", url=" + url +
        ", iconUrl=" + iconUrl +
        "}";
    }
}
