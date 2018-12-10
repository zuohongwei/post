package cn.chinaunicom.posstandardpos.service;

import cn.chinaunicom.posstandardpos.entity.PosStandardpos;
import cn.chinaunicom.platform.service.IHrService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 基准岗位表 服务类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-15
 */
public interface PosStandardposService extends IHrService<PosStandardpos> {

	public List<PosStandardpos> getPosStandardposList();
	
	public Integer savePosStandardpos(PosStandardpos entity);
	
	public Integer updatePosStandardpos(PosStandardpos entity);
	
	public Integer deletePosStandardpos(Long id);

	PosStandardpos getPostInfoById(Map<String, Object> params);

	Integer findProvincePostById(Map<String, Object> params);
	/**
	 * 根据省基准岗位ID删除岗位信息
	 * @param params
	 */
	void deletePosInfo(Map<String, Object> params);
	/**
	 * 根据ID查询省基准岗位信息
	 * @param params
	 * @return
	 */
	PosStandardpos getPosInfoById(Map<String, Object> params);

	void updatePosInfos(List<Map<String, Object>> addParams, List<Map<String, Object>> updateParams, long operatorId);

	/**
	 * @Title: saveProvincePosts
	 * @Description: 批量保存的方法
	 */
	String saveProvincePosts(List<Map<String, Object>> list, long currentUserId);

	void updateActiveEndDate(Map<String, Object> params, long operatorId);
	//查看省基准岗位信息
	PosStandardpos checkProvincePostView(Map<String, Object> map);
	//根据省基准岗位查询主要岗位职责
	List<PosStandardpos> searchProvincePostDutyById(Map<String, Object> map);

	//posstandardpos getPosInfoById(Map<String, Object> params);
}
