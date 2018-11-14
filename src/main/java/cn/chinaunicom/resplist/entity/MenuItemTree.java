/****************************************
 * 描述: (存放转化关键职责菜单树数据)
 * 
 * @Title: cn.chinaunicom.servicecfg.entity.MenuItemInfo.java
 * @author wangrunpu
 * @date 2018年11月1日 下午5:18:52
 ****************************************/
package cn.chinaunicom.resplist.entity;

import java.util.List;

/****************************************
 * 描述: (关键职责菜单树实体)
 * 
 * @ClassName: cn.chinaunicom.servicecfg.entity.MenuItemInfo
 * @author wangrunpu
 * @version V1.0
 ****************************************/
public class MenuItemTree {

	private String				menuId;
	private String				menuName;
	private String				level;
	private String				pMenuId;
	private List<MenuItemTree>	children;

	/**
	 * 描述： get方法
	 * 
	 * @return menuIda
	 *
	 */
	public String getMenuId() {
		return menuId;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param menuId
	 *            参数menuIda
	 *
	 */
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return menuName
	 *
	 */
	public String getMenuName() {
		return menuName;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param menuName
	 *            参数menuName
	 *
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return levelType
	 *
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param level
	 *            参数levelType
	 *
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return pMenuId
	 *
	 */
	public String getpMenuId() {
		return pMenuId;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param pMenuId
	 *            参数pMenuId
	 *
	 */
	public void setpMenuId(String pMenuId) {
		this.pMenuId = pMenuId;
	}

	/**
	 * 描述： get方法
	 * 
	 * @return children
	 *
	 */
	public List<MenuItemTree> getChildren() {
		return children;
	}

	/**
	 * 描述：set方法
	 * 
	 * @param children
	 *            参数children
	 *
	 */
	public void setChildren(List<MenuItemTree> children) {
		this.children = children;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "MenuItemTree [menuId=" + menuId + ", menuName=" + menuName + ", level=" + level + ", pMenuId=" + pMenuId + "]";
	}

}
