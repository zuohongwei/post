package cn.chinaunicom.utils.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import cn.chinaunicom.utils.dao.TreeDataMapper;
import cn.chinaunicom.utils.entity.TreeData;
import cn.chinaunicom.utils.service.TreeDataService;

/**
 * @author zuohongwei
 * @since 2018-10-24
 */
@Service
public class TreeDataServiceImpl extends HrServiceImpl<TreeDataMapper, TreeData> implements TreeDataService {

	@Autowired
	TreeDataMapper mapper;

	@Override
	public List<TreeData> getData(Map<String, Object> params) {
		TreeData orgTree = mapper.getData(params);
		ArrayList<TreeData> arrayList = new ArrayList<TreeData>();
		arrayList.add(orgTree);
		return arrayList;
	}

	@Override
	public List<TreeData> getChildrenData(Map<String, Object> params) {
		return mapper.getChildrenData(params);
	}

	@Override
	@Transactional(
			propagation = Propagation.REQUIRED,
			isolation = Isolation.DEFAULT,
			timeout = 36000,
			rollbackFor = Exception.class)
	public List<TreeData> getAllData(Map<String, Object> params) {
		TreeData orgTree = mapper.getData(params);
		ArrayList<String> idList = new ArrayList<String>();
		idList.add(params.get("id").toString());
		params.put("ids", idList);
		List<TreeData> list = mapper.getChildrenData(params);
		if (list.size() > 0)
		{
			orgTree.setChildren(list);
			setChildrenList(params, list);
		}
		ArrayList<TreeData> arrayList = new ArrayList<TreeData>();
		arrayList.add(orgTree);
		return arrayList;
	}

	private void setChildrenList(Map<String, Object> params, List<TreeData> list) {
		List<String> keyList = new ArrayList<String>();
		for (TreeData org : list)
		{
			keyList.add(org.getKey());
		}
		if (keyList.size() > 500)
		{
			mapper.createTable("temp_tb");
			Map<String, Object> tempMap = new HashMap<String, Object>();
			tempMap.put("tableName", "temp_tb");
			tempMap.put("ids", keyList);
			mapper.insertTempData(tempMap);
			params.put("tempTable", "(SELECT ID FROM TEMP_TB)");
			List<TreeData> newList = mapper.getChildrenDataByTempTB(params);
			mapper.dropTable("temp_tb");
			if (newList.size() > 0)
			{
				HashMap<String, List<TreeData>> map = new HashMap<String, List<TreeData>>();
				for (TreeData org : newList)
				{
					String pid = org.getPid();
					if (null == map.get(pid))
					{
						ArrayList<TreeData> list2 = new ArrayList<TreeData>();
						list2.add(org);
						map.put(pid, list2);
					} else
					{
						map.get(pid).add(org);
					}
				}
				for (TreeData orgTree : list)
				{
					orgTree.setChildren(map.get(orgTree.getKey()));
				}
				setChildrenList(params, newList);
			}
		} else
		{
			params.put("ids", keyList);
			List<TreeData> newList = mapper.getChildrenData(params);
			if (newList.size() > 0)
			{
				HashMap<String, List<TreeData>> map = new HashMap<String, List<TreeData>>();
				for (TreeData org : newList)
				{
					String pid = org.getPid();
					if (null == map.get(pid))
					{
						ArrayList<TreeData> list2 = new ArrayList<TreeData>();
						list2.add(org);
						map.put(pid, list2);
					} else
					{
						map.get(pid).add(org);
					}
				}
				for (TreeData orgTree : list)
				{
					orgTree.setChildren(map.get(orgTree.getKey()));
				}
				setChildrenList(params, newList);
			}
		}
	}

	@Override
	public List<TreeData> getChildrenDataByTempTB(Map<String, Object> params) {

		return mapper.getChildrenDataByTempTB(params);
	}

	@Override
	public List<TreeData> getParentByTempTB(Map<String, Object> params) {

		return mapper.getParentByTempTB(params);
	}
}
