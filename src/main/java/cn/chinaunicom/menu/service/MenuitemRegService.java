package cn.chinaunicom.menu.service;

import cn.chinaunicom.menu.entity.MenuList;
import cn.chinaunicom.menu.entity.MenuitemReg;
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
public interface MenuitemRegService extends IHrService<MenuitemReg> {

	public List<MenuitemReg> getMenuitemRegList();
	
	public Integer saveMenuitemReg(MenuitemReg entity);
	
	public List<MenuList> getMenuList();
	
}
