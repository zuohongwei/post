package cn.chinaunicom.resplist.dao;

import cn.chinaunicom.platform.dao.HrBaseMapper;
import cn.chinaunicom.resplist.entity.EhrcucPosElementStructure;
import cn.chinaunicom.resplist.entity.MenuItemTree;
import cn.chinaunicom.resplist.entity.RespsInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author wangrunpu
 * @since 2018-11-01
 */
public interface EhrcucPosElementStructureMapper extends HrBaseMapper<EhrcucPosElementStructure> {

	List<MenuItemTree> queryBaseRange();

	List<MenuItemTree> getRespRange(@Param("menuId") String menuId);

	/**
	 * 描述: （查询数据 关键职级职责）
	 * 
	 * @param params
	 * @return List<RespsInfo>
	 */
	List<RespsInfo> queryRespsInfo(@Param("sequence") String sequence, @Param("respName") String respName, @Param("levelType") String levelType, @Param("pageSize") int pageSize,
                                   @Param("pageNum") int pageNum);

	int CountRespsInfo(@Param("sequence") String sequence, @Param("respName") String respName, @Param("levelType") String levelType);
}
