package cn.chinaunicom.postionmanagement.service.impl;

import cn.chinaunicom.postionmanagement.dao.PostionManageMapper;
import cn.chinaunicom.postionmanagement.entity.AssignSeniorKeyResp;
import cn.chinaunicom.postionmanagement.entity.PosEmpElementInfo;
import cn.chinaunicom.postionmanagement.entity.PosVersionInfo;
import cn.chinaunicom.postionmanagement.entity.PostionManageEntity;
import cn.chinaunicom.postionmanagement.service.PostionManageService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

import javax.annotation.Resource;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author wangrunpu
 * @since 2018-11-14
 */
@Service
public class PostionManageServiceImpl extends HrServiceImpl<PostionManageMapper, PostionManageEntity> implements PostionManageService {



	@Resource
	PostionManageMapper mapper;


	@Override
	public List<PostionManageEntity> getEhrcucPosTreeVList() {
		return mapper.selectList(new EntityWrapper<PostionManageEntity>().eq("1", "1"));
	}

	@Override
	public Integer saveEhrcucPosTreeV(PostionManageEntity entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updateEhrcucPosTreeV(PostionManageEntity entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deleteEhrcucPosTreeV(Long id) {
		return mapper.deleteById(id);
	}

	@Override
	public List<PostionManageEntity> getKeyResp(String mId) {
		return mapper.getKeyResp(mId);
	}

    @Override
    public AssignSeniorKeyResp getSelecInfo(int id) {
        return mapper.getSelecInfo(id);
    }

    @Override
	public void saveEmpAssKeyrespInfo(Long ebsAssId, Long personId, Long operater, PosEmpElementInfo pos) {
		//获取员工分配关键职责当前版本开始日期
		PosVersionInfo ver = this.getEmpAssCurVersionInfo(ebsAssId);

		if(ver != null){

			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
			//当前版本开始日期
			String verDate = format.format(ver.getEffetiveStartDate());
			//当前系统日期
			String sysDate = format.format(new Date());

			if(verDate.equals(sysDate)){
				//更新版本审批状态 attribute1 = 0；
				this.updateKeyrespVerStatus(ver.getVersionId(),operater);
				//删除当前版本分配记录并重新插入当前页面记录
				this.delCurVerAssRecord(ver.getVersionId(),personId);
				//插入当前页面记录
				this.saveEmpAssKeyresp(pos,ver.getVersionId());
			}else{
				//自动创建的版本的开始日期为每月的1日，且自动将上一版本的结束日期置为（新版本开始日期 — 1）
				this.createNewVersion(ebsAssId,personId,operater);

				//更改上一版本结束日期
				this.updatePreVersionEndDate(ver.getVersionId(),operater);
				//根据refenenceid获取新版本id
				PosVersionInfo newVersionInfo= this.getEmpAssCurVersionInfo(ebsAssId);

				//插入当前页面记录
				this.saveEmpAssKeyresp(pos,newVersionInfo.getVersionId());
			}
		}else{
			//自动创建的版本的开始日期为每月的1日
			this.createNewVersion(ebsAssId,personId,operater);
			//根据refenenceid获取新版本id
			PosVersionInfo newVersionInfo= this.getEmpAssCurVersionInfo(ebsAssId);
			//插入当前页面记录
			this.saveEmpAssKeyresp(pos,newVersionInfo.getVersionId());
		}
	}

	@Override
	public List<AssignSeniorKeyResp> selectPositionJT(List idList,Long level,Long kid,Long rangeId,int pageSize,int pageNum){
			Map<String, Object> pramas = new HashMap<>();
			pramas.put("idList", idList);
			pramas.put("level", level);
			pramas.put("kid", kid);
			pramas.put("rangeId", rangeId);
			pramas.put("pageSize", pageSize);
			pramas.put("pageNum", pageNum);
			return mapper.selectPositionJT(pramas);
	}

    @Override
    public int countPositionJT(List idList, Long level, Long kid, Long rangeId) {
        Map<String, Object> pramas = new HashMap<>();
        pramas.put("idList", idList);
        pramas.put("level", level);
        pramas.put("kid", kid);
        pramas.put("rangeId", rangeId);
        return mapper.countPositionJT(pramas);
    }

    @Override
    public List<AssignSeniorKeyResp> getAllDetailJT(int assignMentId) {
        return mapper.getAllDetailJT(assignMentId);
    }

    /**
	 * 获取员工分配关键职责当前版本开始日期
	 * @param referenceId
	 * @return
	 */
	public PosVersionInfo getEmpAssCurVersionInfo(Long referenceId) {

		return mapper.getEmpAssCurVersionInfo(referenceId);
	}

	/**
	 * 更新版本审批状态
	 * @param versionId
	 * @param operater
	 */
	public void updateKeyrespVerStatus(Long versionId, Long operater){

		mapper.updateKeyrespVerStatus(versionId,operater);

	}

	/**
	 * 删除员工当前版本分配记录
	 * @param versionId
	 * @param personId
	 */
	public void delCurVerAssRecord(Long versionId, Long personId) {

		mapper.delCurVerAssRecord(versionId,personId);

	}

	/**
	 * 保存员工分配关键职责
	 * @param pos
	 * @param versionId
	 */
	public void saveEmpAssKeyresp(PosEmpElementInfo pos, Long versionId) {
		mapper.saveEmpAssKeyresp(pos,versionId);
	}

	/**
	 * 创建员工分配新版本
	 * @param referenceId
	 * @param operater
	 * @param personId
	 * @return
	 */
	public void createNewVersion(Long referenceId, Long personId, Long operater) {
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("referenceId", referenceId);
        params.put("personId", personId);
        params.put("operater", operater);
        int index = mapper.selectEmpAssVerIndexNew(params);
        params.put("index", index);
        mapper.createNewVersion(params);
	}

	/**
	 * 更改上一版本日期
	 * @param versionId
	 * @param operater
	 */
	public void updatePreVersionEndDate(long versionId, Long operater) {
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("versionId", versionId);
        params.put("operater", operater);
		mapper.updatePreVersionEndDate(params);
	}

	@Override
	public List<List<Integer>> getOrgIdList(int orgId) {
		List<Integer> list = new ArrayList();
		list.add(orgId);
		List<List<Integer>> allList = new ArrayList();
		this.getIdByPid(list,allList);
		return allList;
	}

	private void getIdByPid(List<Integer> pidList,List<List<Integer>> allList){
		if(pidList.size()>0){
			List<Integer> newList =mapper.getIdByPid(pidList);
			allList.add(newList);
			getIdByPid(newList,allList);
		}
	}


}
