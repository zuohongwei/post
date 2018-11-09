package cn.chinaunicom.menu.dao;

import java.util.List;

import cn.chinaunicom.menu.entity.MenuList;
import cn.chinaunicom.menu.entity.MenuItemReg;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 * 菜单注册 Mapper 接口
 * </p>
 *
 * @author zuohongwei
 * @since 2018-09-19
 */
public interface MenuItemRegMapper extends HrBaseMapper<MenuItemReg> {

	List<MenuList> getMenuList();
}
