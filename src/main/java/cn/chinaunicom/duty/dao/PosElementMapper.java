package cn.chinaunicom.duty.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.duty.entity.PosElement;
import cn.chinaunicom.duty.entity.PosElementEmp;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-01
 */
public interface PosElementMapper extends HrBaseMapper<PosElement> {

	List<PosElement> getElementList(@Param("versionId")String versionId,@Param("elementType")String elementType,@Param("posCateId")String posCateId);


	List<PosElement> getPosElementPagList(Page<PosElement> objectPage, Map<String, Object> params);

	List<PosElementEmp> getPosElementPagList(Map<String, Object> params);

	Integer getPosElementPagListCount(Map<String, Object> params);
	List<PosElement> getCateList();

	List<String> getIds(String elementName);


	Integer updateElementInfo(List<PosElement>list);

	List<PosElement> getDutyList();


}

