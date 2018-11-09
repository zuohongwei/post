package cn.chinaunicom.menu.service.impl;

import cn.chinaunicom.menu.entity.MenuList;
import cn.chinaunicom.menu.entity.MenuItemReg;
import cn.chinaunicom.menu.dao.MenuItemRegMapper;
import cn.chinaunicom.menu.service.MenuItemRegService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 * 菜单注册 服务实现类
 * </p>
 *
 * @author zuohongwei
 * @since 2018-09-19
 */
@Service
public class MenuItemRegServiceImpl extends HrServiceImpl<MenuItemRegMapper, MenuItemReg> implements MenuItemRegService {

	@Autowired
	MenuItemRegMapper mapper;
	
	@Override
	public List<MenuItemReg> getMenuitemRegList() {
		return mapper.selectList(new EntityWrapper<MenuItemReg>().eq("1", "1").orderBy("code"));
	}

	@Override
	public Integer saveMenuitemReg(MenuItemReg entity) {
		return mapper.insert(entity);
	}

	@Override
	public List<MenuList> getMenuList() {
		return mapper.getMenuList();
	}
}
