package cn.chinaunicom.duty.dao;

import cn.chinaunicom.duty.entity.OrganizationAll;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 组织信息表 Mapper 接口
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-29
 */
public interface OrganizationAllMapper extends HrBaseMapper<OrganizationAll> {
    Map<String,Object> getTop(@Param("organizationId")String topId);

    List<OrganizationAll> getSub(@Param("organizationId")String topId);

    List<String>getAllIds(Map<String,Object>map);
}
