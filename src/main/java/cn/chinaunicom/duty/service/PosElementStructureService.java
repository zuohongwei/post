package cn.chinaunicom.duty.service;

import cn.chinaunicom.duty.entity.PosElementStructure;
import cn.chinaunicom.platform.service.IHrService;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-02
 */
public interface PosElementStructureService extends IHrService<PosElementStructure> {
    List<PosElementStructure>getParentInfo(@Param("elementIdParent") String elementIdParent, @Param("versionId") String versionId);

    int  createElementStructureInfo(List<PosElementStructure>list);
}

