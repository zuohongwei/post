package cn.chinaunicom.postionmanagement.dao;

import cn.chinaunicom.postionmanagement.entity.AssignSeniorKeyResp;
import cn.chinaunicom.postionmanagement.entity.PosEmpElementInfo;
import cn.chinaunicom.postionmanagement.entity.PosVersionInfo;
import cn.chinaunicom.postionmanagement.entity.PostionManageEntity;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * VIEW Mapper 接口
 * </p>
 *
 * @author wangrunpu
 * @since 2018-11-14
 */
public interface PostionManageMapper extends HrBaseMapper<PostionManageEntity> {

    List<PostionManageEntity> getKeyResp(@Param("mId") String mId);

    PosVersionInfo getEmpAssCurVersionInfo(@Param("referenceId")Long referenceId);

    AssignSeniorKeyResp getSelecInfo(int id);

    int updateKeyrespVerStatus(@Param("versionId")Long versionId,@Param("operater")Long operater);

    int delCurVerAssRecord(@Param("versionId")Long versionId,@Param("personId")Long personId);

    int saveEmpAssKeyresp(@Param("p")PosEmpElementInfo p,@Param("versionId")Long versionId);

    int createNewVersion(Map params);

    int selectEmpAssVerIndexNew(Map params);

    int updatePreVersionEndDate(Map params);

    List<AssignSeniorKeyResp> selectPositionJT(Map params);

    int countPositionJT(Map params);

    List<Integer> getIdByPid(List<Integer> pidList);

    List<AssignSeniorKeyResp> getAllDetailJT(@Param("assignMentId")int assignMentId);
}
