package cn.chinaunicom.posstandardpos.dao;

import cn.chinaunicom.posstandardpos.entity.PosStandardpos;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 基准岗位表 Mapper 接口
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-15
 */
public interface PosStandardposMapper extends HrBaseMapper<PosStandardpos> {

    List<PosStandardpos> getPosListById(Map<String, Object> params);

    PosStandardpos getPostInfoById(Map<String, Object> params);

    Integer findProvincePostById(Map<String, Object> params);

    void deletePosInfo(Map<String, Object> params);

    PosStandardpos getPosInfoById(Map<String, Object> params);

    void createPosInfo(PosStandardpos posStandardpos  );

    void updatePosInfo(@Param("stringObjectMap") Map<String, Object> stringObjectMap, @Param("operatorId")long operatorId);

    int findPostByName(Map<String, String> paramsMap);

    List<PosStandardpos> selectposStandardposInfoByName(Map<String, String> paramsMap);

    void saveProvincePostView(PosStandardpos posstandardposinfo);

    void updateActiveEndDate(Map<String, Object> params);

    PosStandardpos checkProvincePostView(Map<String, Object> map);//查看省基准岗位信息

    List<PosStandardpos> searchProvincePostDutyById(Map<String, Object> map);
}
