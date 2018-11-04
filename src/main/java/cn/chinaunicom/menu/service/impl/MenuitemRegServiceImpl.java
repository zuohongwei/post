package cn.chinaunicom.menu.service.impl;

import cn.chinaunicom.menu.entity.MenuList;
import cn.chinaunicom.menu.entity.MenuitemReg;
import cn.chinaunicom.menu.dao.MenuitemRegMapper;
import cn.chinaunicom.menu.service.MenuitemRegService;
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
public class MenuitemRegServiceImpl extends HrServiceImpl<MenuitemRegMapper, MenuitemReg> implements MenuitemRegService {

	@Autowired
	MenuitemRegMapper mapper;
	
	@Override
	public List<MenuitemReg> getMenuitemRegList() {
		return mapper.selectList(new EntityWrapper<MenuitemReg>().eq("1", "1").orderBy("code"));
	}

	@Override
	public Integer saveMenuitemReg(MenuitemReg entity) {
		return mapper.insert(entity);
	}

	@Override
	public List<MenuList> getMenuList() {
		return mapper.getMenuList();
	}
}
