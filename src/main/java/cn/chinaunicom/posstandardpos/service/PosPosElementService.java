package cn.chinaunicom.posstandardpos.service;

import cn.chinaunicom.posstandardpos.entity.PosPosElement;
import cn.chinaunicom.platform.service.IHrService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 基准岗位和要素关系 服务类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-19
 */
public interface PosPosElementService extends IHrService<PosPosElement> {

	public List<PosPosElement> getPosPosElementList();
	
	public Integer savePosPosElement(PosPosElement entity);
	
	public Integer updatePosPosElement(PosPosElement entity);
	
	public Integer deletePosPosElement(Long id);

	/**
	 * 根据ID获取岗位所有子职责
	 * @param params
	 * @return
	 */
    List<PosPosElement> getElementById(Map<String, Object> params);
	/**
	 * 获取岗位职责
	 * @return
	 */
	List<PosPosElement> selectElebyPosId(String posId);
	/**
	 * 修改岗位职责
	 * @param params
	 * @param operatorId
	 * @param updateparam
	 * @param delparam
	 */
    void updatePosDutyInfo(List<Map<String, Object>> params, Map<String, Object> delparam, Map<String, Object> updateparam, long operatorId);
}
