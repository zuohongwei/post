package cn.chinaunicom.duty.dao;

import cn.chinaunicom.duty.entity.PosElementStructure;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-02
 */
public interface PosElementStructureMapper extends HrBaseMapper<PosElementStructure> {
    List<PosElementStructure> getParentInfo(@Param("elementIdParent") String elementIdParent, @Param("versionId") String versionId);

    int  createElementStructureInfo(List<PosElementStructure>list);

}
