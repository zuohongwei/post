package cn.chinaunicom.postionmanagement.service;

import cn.chinaunicom.postionmanagement.entity.AssignSeniorKeyResp;
import cn.chinaunicom.postionmanagement.entity.PosEmpElementInfo;
import cn.chinaunicom.postionmanagement.entity.PosVersionInfo;
import cn.chinaunicom.postionmanagement.entity.PostionManageEntity;
import cn.chinaunicom.platform.service.IHrService;


import java.util.List;
import java.util.Map;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author wangrunpu
 * @since 2018-11-14
 */
public interface PostionManageService extends IHrService<PostionManageEntity> {

	public List<PostionManageEntity> getEhrcucPosTreeVList();
	
	public Integer saveEhrcucPosTreeV(PostionManageEntity entity);
	
	public Integer updateEhrcucPosTreeV(PostionManageEntity entity);
	
	public Integer deleteEhrcucPosTreeV(Long id);

	public List<PostionManageEntity> getKeyResp(String mId);

	public AssignSeniorKeyResp getSelecInfo(int id);

	public void	saveEmpAssKeyrespInfo(Long ebsAssId,Long personId,Long operater,PosEmpElementInfo posEmpElementInfo);

	public List<AssignSeniorKeyResp> selectPositionJT(List idList,Long level,Long kid,Long rangeId,int pageSzie,int pageNum);

    public int countPositionJT(List idList,Long level,Long kid,Long rangeId);

	public List<List<Integer>> getOrgIdList(int orgId);

    public List<AssignSeniorKeyResp> getAllDetailJT(int assignMentId);

}
