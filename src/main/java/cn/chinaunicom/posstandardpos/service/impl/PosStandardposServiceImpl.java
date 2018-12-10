package cn.chinaunicom.posstandardpos.service.impl;

import cn.chinaunicom.common.PosUtil;
import cn.chinaunicom.duty.dao.PosElementMapper;
import cn.chinaunicom.posstandardpos.dao.LookupsMapper;
import cn.chinaunicom.posstandardpos.dao.PosPosElementMapper;
import cn.chinaunicom.posstandardpos.entity.PosPosElement;
import cn.chinaunicom.posstandardpos.entity.PosStandardpos;
import cn.chinaunicom.posstandardpos.dao.PosStandardposMapper;
import cn.chinaunicom.posstandardpos.service.PosStandardposService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 * 基准岗位表 服务实现类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-15
 */
@Service
public class PosStandardposServiceImpl extends HrServiceImpl<PosStandardposMapper, PosStandardpos> implements PosStandardposService {

	@Autowired
	PosStandardposMapper mapper;
	@Autowired
	PosPosElementMapper posPosElementMapper;
	@Autowired
	LookupsMapper lookupsMapper;
	@Autowired
	PosElementMapper posElementMapper;


	@Override
	public List<PosStandardpos> getPosStandardposList() {
		return mapper.selectList(new EntityWrapper<PosStandardpos>().eq("1", "1"));
	}

	@Override
	public Integer savePosStandardpos(PosStandardpos entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updatePosStandardpos(PosStandardpos entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deletePosStandardpos(Long id) {
		return mapper.deleteById(id);
	}

	@Override
	public PosStandardpos getPostInfoById(Map<String, Object> params) {
		return mapper.getPostInfoById(params);
	}

	@Override
	public Integer findProvincePostById(Map<String, Object> params) {
		return mapper.findProvincePostById(params);
	}
	/**
	 * 根据省基准岗位ID删除岗位信息
	 */
	@Override
	public void deletePosInfo(Map<String, Object> params) {
		mapper.deletePosInfo(params);
		//删除职责
		posPosElementMapper.deletePosElement(params);
	}
	/**
	 * 根据ID查询省基准岗位信息
	 */
	@Override
	public PosStandardpos getPosInfoById(Map<String, Object> params) {
		return mapper.getPosInfoById(params);
	}

	@Override
	public void updatePosInfos(List<Map<String, Object>> addParams, List<Map<String, Object>> updateParams, long operatorId) {
		//新增
		for(int i=0;i<addParams.size();i++) {
			String posName = (String) addParams.get(i).get("posName");
			Long parentPosId = Long.valueOf((String) addParams.get(i).get("parentPosId"));
			Long posCateId = Long.valueOf((String) addParams.get(i).get("posCateId"));
			Long posSubcateId = Long.valueOf((String) addParams.get(i).get("posSubcateId"));
			Long orgId = (Long) addParams.get(i).get("orgId");
			String coreFlag = (String) addParams.get(i).get("coreFlag");
			String orgLevel = (String) addParams.get(i).get("orgLevel");
			String educationDegree = (String) addParams.get(i).get("educationDegree");
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
			Date activeStartDate = null;
			try {
				activeStartDate = format.parse((String)addParams.get(i).get("activeStartDate"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Date activeEndDate = null;
			try {
				activeEndDate = format.parse((String)addParams.get(i).get("activeEndDate"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			String attribute1 = (String) addParams.get(i).get("attribute1");
			PosStandardpos posStandardpos = new PosStandardpos();
			posStandardpos.setPosName(posName);
			posStandardpos.setParentPosId(parentPosId);
			posStandardpos.setPosCateId(posCateId);
			posStandardpos.setPosSubcateId(posSubcateId);
			posStandardpos.setOrgId(orgId);
			posStandardpos.setOrgLevel(orgLevel);
			posStandardpos.setEducationDegree(educationDegree);
			posStandardpos.setActiveStartDate(activeStartDate);
			posStandardpos.setActiveEndDate(activeEndDate);
			posStandardpos.setAttribute1(attribute1);
			posStandardpos.setCoreFlag(coreFlag);
			posStandardpos.setOperatorId(operatorId);
			//	addParams.get(i).put("operatorId",operatorId);
			//新增岗位
			mapper.createPosInfo(posStandardpos);
			//新增职责
			List<PosPosElement> eleList = null;
			if (addParams.get(i).get("parentPosId") != null && !"".equals(addParams.get(i).get("parentPosId"))) {
				eleList = posPosElementMapper.selectElebyPosId((String) addParams.get(i).get("parentPosId"));
			}
			List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
			if (eleList.size() > 0) {
				for (int j = 0; j < eleList.size(); j++) {
					Map<String, Object> param = new HashMap<String, Object>();
					param.put("skid", eleList.get(j).getSkid());
					param.put("operatorId", operatorId);
					param.put("posId", posStandardpos.getPosId());
					params.add(param);
				}
			}
			for (int k = 0; k < params.size(); k++) {
				posPosElementMapper.createPosDutyInfo(params.get(k));
			}
		}
		//修改
		for(int i=0;i<updateParams.size();i++){

			mapper.updatePosInfo(updateParams.get(i), operatorId);
		}


	}
	/**
	 *
	 * @Title: importSpostInfos
	 * @Description: 省基准岗位批量导入
	 */
	@Override
	public String saveProvincePosts(List<Map<String, Object>> list, long currentUserId) {
		String result="";
		Map<String, String> paramsMap = new HashMap<String, String>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置自己想要的时间格式

		for (Map<String, Object> map : list) {
			// 校验岗位名称是否重复
			paramsMap.put("posType", "S");
			String sPost = map.get("sPost").toString();
			paramsMap.put("post", sPost);
			String orgId = map.get("orgId").toString();
			paramsMap.put("orgId", orgId);
			boolean repeatFlag=false;
			Integer rFlag = mapper.findPostByName(paramsMap);
			if(rFlag<1){
				repeatFlag=true;
			}
			else {
				repeatFlag = false;
			}
			if (repeatFlag) {

				paramsMap.put("posType", "J");
				// 获取集团基准岗位名称
				String jPost = map.get("jPost").toString();
				paramsMap.put("post", jPost);
				// 根据集团基准岗位名称获取
				List<PosStandardpos> posstandardposinfo = mapper.selectposStandardposInfoByName(paramsMap);
				if (posstandardposinfo != null) {
					PosStandardpos posStandardpos = posstandardposinfo.get(0);
					String startTime =  (String)map.get("startTime");
					Date aa= null;
					try {
						aa = sdf.parse(startTime);
						posStandardpos.setActiveStartDate(aa);
					} catch (ParseException e) {
						e.printStackTrace();
					}


					String  endTime = (String) map.get("endTime");
					Date dd = null;
					try {
						dd = sdf.parse(startTime);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					posStandardpos.setActiveEndDate(dd);
					posStandardpos.setPosName(sPost);
					// 组织层级
					String level = map.get("orgLevel").toString();
					String orglevel = "";
					if (level.contains("集团")) {
						orglevel = ".J";
					}
					if (level.contains("省")) {
						orglevel += ".S";
					}
					if (level.contains("市")) {
						orglevel += ".D";
					}
					if (level.contains("县")) {
						orglevel += ".X";
					}
					posStandardpos.setOrgLevel(orglevel);
					// 是否核心
					String coreFlag = map.get("coreFlag").toString();
					if (coreFlag.trim().equals("是")) {
						coreFlag = "Y";
					} else {
						coreFlag = "N";
					}
					posStandardpos.setCoreFlag(coreFlag);
					// 学历
					String degreeName = map.get("degree").toString();
					Map<String, String> degrees = getDegrees();
					String degreeCode = degrees.get(degreeName);
					posStandardpos.setEducationDegree(degreeCode);
					// 序列
					String posCate = map.get("posCate").toString();
					Map<String, Object> params = new HashMap<String, Object>();
					params.put("type", "10");
					params.put("name", posCate);
					Long posCateId = posElementMapper.findPosCateByName(params);
					posStandardpos.setPosCateId(posCateId);
					// 子序列
					String subCate = map.get("subCate").toString();
					params.put("type", "20");
					params.put("name", subCate);
					Long subCateId = posElementMapper.findPosCateByName(params);
					posStandardpos.setPosSubcateId(subCateId);

					posStandardpos.setOrgId(Long.parseLong(orgId));
					posStandardpos.setCreatedBy(currentUserId);
					posStandardpos.setAttribute1("S");
					//long posId = dao.getPosId();
					//posstandardposinfo.setPosId(posId);
					mapper.saveProvincePostView(posStandardpos);	//保存省基准岗位信息
					// 新增职责
					List<PosPosElement> eleList = null;
					if (posStandardpos.getParentPosId() != null) {
						eleList = posPosElementMapper.selectElebyPosId(posStandardpos
								.getParentPosId().toString());
					}
					if (eleList.size() > 0) {
						for (int j = 0; j < eleList.size(); j++) {
							Map<String, Object> param = new HashMap<String, Object>();
							param.put("skid", eleList.get(j).getSkid());
							param.put("operatorId", currentUserId);
							param.put("posId", posStandardpos.getPosId());
							int sucessNum=posPosElementMapper.createPosDutyInfo(param);
							 result="添加数据成功！";
						}

					}

				}
			} else {
						 result="省基准岗位名称："+"在系统中已存在！";
			}
		}
		return result;
	}

	@Override
	public void updateActiveEndDate(Map<String, Object> params, long operatorId) {
		params.put(String.valueOf(operatorId),operatorId);
		mapper.updateActiveEndDate(params);
	}

	// 查看省基准岗位信息(通过posid)
	@Override
	public PosStandardpos checkProvincePostView(Map<String, Object> map) {
		return mapper.checkProvincePostView(map);
	}
	// 根据省基准岗位查询主要岗位职责
	@Override
	public List<PosStandardpos> searchProvincePostDutyById(Map<String, Object> map) {
		return mapper.searchProvincePostDutyById(map);
	}

	/**
	 *
	 * @Title: getDegrees
	 * @Description: 获取学历信息
	 * @author 张迟
	 * @param @return 设定文件
	 * @return Map<String,String> 返回类型
	 * @throws
	 */
	private Map<String, String> getDegrees() {
		Map<String, String> degree = PosUtil.getDegree();
		if (degree == null) {
			List<Map<String, String>> ds = lookupsMapper
					.findPosEducationDegree("EHRCUC_POS_EDUCATION_DEGREE");
			degree = new HashMap<String, String>();
			for (int i = 0; i < ds.size(); i++) {
				Map<String, String> mp = ds.get(i);
				String name = mp.get("MEANING");
				String code = mp.get("LOOKUP_CODE");
				degree.put(name, code);
			}
			PosUtil.setDegree(degree);
		}
		return degree;
	}

}
