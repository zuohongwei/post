package cn.chinaunicom.resplist.service;

import cn.chinaunicom.platform.service.IHrService;
import cn.chinaunicom.resplist.entity.EhrcucPosElementStructure;
import cn.chinaunicom.resplist.entity.MenuItemTree;
import cn.chinaunicom.resplist.entity.RespsInfo;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wangrunpu
 * @since 2018-11-01
 */
public interface EhrcucPosElementStructureService extends IHrService<EhrcucPosElementStructure> {

	public List<EhrcucPosElementStructure> getEhrcucPosElementStructureList();

	public Integer saveEhrcucPosElementStructure(EhrcucPosElementStructure entity);

	/**
	 * 描述: （查询条件 职责范围）
	 * 
	 * @return Object
	 */
	public List<MenuItemTree> queryRespRange();

	/**
	 * 描述: （查询数据 关键职责职级）
	 * 
	 * @param params
	 * @return RespsInfo
	 */
	public List<RespsInfo> queryRespsInfo(String sequence, String respName, String levelType, int pageSize, int pageNum);

	public int getTotalResps(String sequence, String respName, String levelType);

}
