package cn.chinaunicom.resplist.service.impl;

import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import cn.chinaunicom.resplist.dao.EhrcucPosElementStructureMapper;
import cn.chinaunicom.resplist.entity.EhrcucPosElementStructure;
import cn.chinaunicom.resplist.entity.MenuItemTree;
import cn.chinaunicom.resplist.entity.RespsInfo;
import cn.chinaunicom.resplist.service.EhrcucPosElementStructureService;
import cn.chinaunicom.utils.dao.TreeDataMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author wangrunpu
 * @since 2018-11-01
 */
@Service
public class EhrcucPosElementStructureServiceImpl extends HrServiceImpl<EhrcucPosElementStructureMapper, EhrcucPosElementStructure> implements EhrcucPosElementStructureService {

	@Resource
    EhrcucPosElementStructureMapper mapper;

	@Resource
	TreeDataMapper					treemapper;

	@Override
	public List<EhrcucPosElementStructure> getEhrcucPosElementStructureList() {
		return mapper.selectList(new EntityWrapper<EhrcucPosElementStructure>().eq("1", "1"));
	}

	@Override
	public Integer saveEhrcucPosElementStructure(EhrcucPosElementStructure entity) {
		return mapper.insert(entity);
	}

	/**
	 * {@查询职责范围方法}
	 */
	@Override
	public List<MenuItemTree> queryRespRange() {
		// 获取所有的根节点
		List<MenuItemTree> treeInfos = mapper.queryBaseRange();
		// 创建一个新的树形集合，用来转化为固定格式的JSON
		List<MenuItemTree> trees = new ArrayList<MenuItemTree>();
		for (MenuItemTree menuItemInfo : treeInfos)
		{
			String menuId = menuItemInfo.getMenuId();
			// 根据父ID查询子
			List<MenuItemTree> menus = mapper.getRespRange(menuId);
			menuItemInfo.setChildren(menus);
			if (menus != null && menus.size() > 0)
			{
				for (MenuItemTree m : menus)
				{
					String menuId2 = m.getMenuId();
					// 根据父ID查询子
					List<MenuItemTree> m3 = mapper.getRespRange(menuId2);
					m.setChildren(m3);
				}
			}
			trees.add(menuItemInfo);
		}
		return trees;
	}

	/**
	 * {@inheritDoc}
	 */
	/*
	 * @Override public List<RespsInfo> queryRespsInfo(Map<String, Object>
	 * params) {
	 * 
	 * return mapper.queryRespsInfo(params); }
	 */
	@Override
	public List<RespsInfo> queryRespsInfo(String sequence, String respName, String levelType, int pageSize, int pageNum) {
		return mapper.queryRespsInfo(sequence, respName, levelType, pageSize, pageNum);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalResps(String sequence, String respName, String levelType) {
		// TODO Auto-generated method stub
		return mapper.CountRespsInfo(sequence, respName, levelType);
	}

}
