package cn.chinaunicom.posstandardpos.dao;

import cn.chinaunicom.posstandardpos.entity.PosPosElement;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 基准岗位和要素关系 Mapper 接口
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-19
 */
public interface PosPosElementMapper extends HrBaseMapper<PosPosElement> {

    List<PosPosElement> getElementById(Map<String, Object> params);

    List<PosPosElement> selectElebyPosId(@Param("posId") String posId);

    void deletePosElement(Map<String, Object> params);

    int createPosDutyInfo(@Param("stObMap")Map<String, Object> stringObjectMap);

    void deletePosDutyInfo(Map<String, Object> delparam);

    void createPosDutyInfoNew(@Param("idsMap")List<Map<String, Object>> params);

    void updatePosRate(Map<String, Object> updateparam);
}
