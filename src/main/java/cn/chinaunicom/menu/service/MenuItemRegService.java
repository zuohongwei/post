package cn.chinaunicom.menu.service;

import cn.chinaunicom.menu.entity.MenuList;
import cn.chinaunicom.menu.entity.MenuItemReg;
import cn.chinaunicom.platform.service.IHrService;
import java.util.List;

/**
 * <p>
 * 菜单注册 服务类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-09-19
 */
public interface MenuItemRegService extends IHrService<MenuItemReg> {

	public List<MenuItemReg> getMenuitemRegList();
	
	public Integer saveMenuitemReg(MenuItemReg entity);
	
	public List<MenuList> getMenuList();
	
}
