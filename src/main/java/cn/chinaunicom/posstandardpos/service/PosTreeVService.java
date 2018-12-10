package cn.chinaunicom.posstandardpos.service;

import cn.chinaunicom.posstandardpos.entity.PosTreeV;
import cn.chinaunicom.platform.service.IHrService;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-09
 */
public interface PosTreeVService extends IHrService<PosTreeV> {

	public List<PosTreeV> getPosTreeVList();
	
	public Integer savePosTreeV(PosTreeV entity);
	
	public Integer updatePosTreeV(PosTreeV entity);
	
	public Integer deletePosTreeV(Long id);

    List<PosTreeV> getSubcateList(HashMap<Object, Object> params);

	/**
	 * 获取专业
	 * @param posId
	 * @return
	 */
    List<PosTreeV> getMListById(String posId);
	/**
	 * 获取关键职责
	 * @param mid
	 * @return
	 */
	List<PosTreeV> getKListByMId(Long mid, String posId);
	/**
	 * 获取子职责
	 * @param kid
	 * @return
	 */
	List<PosTreeV> getSkListByKId(Long kid, String posId);

	/**
	 * 获得所有关键职责
	 * @param objec
	 * @param posId
	 * @return
	 */
	List<PosTreeV> getKListsByMId(List<Object> objec, String posId);

	/**
	 * 获得所有子职责
	 * @param objec2
	 * @param posId
	 * @return
	 */
	List<PosTreeV> getSkListsByKId(List<Object> objec2, String posId);
}
