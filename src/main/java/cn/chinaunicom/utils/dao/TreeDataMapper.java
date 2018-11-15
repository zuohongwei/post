package cn.chinaunicom.utils.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.chinaunicom.platform.dao.HrBaseMapper;
import cn.chinaunicom.utils.entity.TreeData;

/**
 *
 * @author zuohongwei
 * @since 2018-10-24
 */
public interface TreeDataMapper extends HrBaseMapper<TreeData> {

	public List<TreeData> getChildrenData(Map<String, Object> params);

	public TreeData getData(Map<String, Object> params);

	public void createTable(@Param("tableName") String tableName);

	public void dropTable(@Param("tableName") String tableName);

	public void insertTempData(Map<String, Object> tempMap);

	public List<TreeData> getChildrenDataByTempTB(Map<String, Object> params);//add by lizhenhao

	public List<TreeData> getParentByTempTB(Map<String, Object> params);//add by lizhenhao
}
