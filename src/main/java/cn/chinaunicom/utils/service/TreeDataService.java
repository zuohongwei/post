package cn.chinaunicom.utils.service;

import java.util.List;
import java.util.Map;

import cn.chinaunicom.platform.service.IHrService;
import cn.chinaunicom.utils.entity.TreeData;

/**
 * @author zuohongwei
 * @since 2018-10-24
 */
public interface TreeDataService extends IHrService<TreeData> {

	public List<TreeData> getData(Map<String, Object> params);

	public List<TreeData> getChildrenData(Map<String, Object> params);

	public List<TreeData> getAllData(Map<String, Object> params);

	public List<TreeData> getChildrenDataByTempTB(Map<String, Object> params);

	public List<TreeData> getParentByTempTB(Map<String, Object> params);

}
