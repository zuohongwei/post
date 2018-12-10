package cn.chinaunicom.postionmanagement.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.chinaunicom.postionmanagement.entity.AssignSeniorKeyResp;
import cn.chinaunicom.postionmanagement.entity.PosEmpElementInfo;
import cn.chinaunicom.utils.entity.TreeData;
import cn.chinaunicom.utils.service.TreeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.plugins.Page;
import cn.chinaunicom.postionmanagement.entity.PostionManageEntity;
import cn.chinaunicom.postionmanagement.service.PostionManageService;
import cn.chinaunicom.platform.utils.MessageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * **************************************
 * 描述: 管理人员职位管理Controller
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author wangrunpu 
 * @since 2018-11-14
 * @version V1.0
 * **************************************
 */
@Api(value = "管理人员职位管理(集团)", tags = "管理人员职位管理(集团)")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/postionmanage")
public class PostionManageController {

	@Autowired
	PostionManageService service;

	@Autowired
	TreeDataService  treeservice;
	

	/**
	*描述: (查询关键职责)
	*@param
	*@return List<PostionManageEntity>
	*/
	@ApiOperation(
			value = "查询条件: 关键职责",
			notes = "接口发布说明",
			httpMethod = "POST")
	@RequestMapping("/getKeyResp")
	public List<PostionManageEntity> getKeyResp(@RequestParam("mId") String mId){

		return service.getKeyResp(mId);

	}

	/**
	 *描述: (根据父级Id查询下级部门组织)
	 *
	 *@param topId
	 *@return
	 */
	@ApiOperation(
			value = "查询条件: 部门组织树",
			notes = "接口发布说明",
			httpMethod = "POST")
	@RequestMapping("/getChildrenTree")
	public List<TreeData> getChildrenTree(@RequestParam("topId") String topId){

		StringBuffer sb = new StringBuffer();
		sb.append("(SELECT organization_id_child FROM EHRCUC_ORG_STRUCTURE_ELEMENTS A WHERE ").append("A.organization_id_parent =").append(topId)
				.append(")");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("tableName", "EHRBASE_ORGANIZATION_ALL");
		params.put("idCode", "ORGANIZATION_ID");
		params.put("pidCode", "ORGANIZATION_ID_PARENT");
		params.put("nameCode", "NAME");
		params.put("tempTable", sb.toString());
		params.put("templete", " IFNULL(DATE_TO, DATE_FORMAT(sysdate(), '%Y-%m-%d')) >= DATE_FORMAT(sysdate(), '%Y-%m-%d')");
		List<TreeData> tempTB = treeservice.getChildrenDataByTempTB(params);
		return tempTB;
		}


	/**
	 *描述: (修改关键职责)
	 *
	 *@return
	 */
	@ApiOperation(
			value = "修改关键职责",
			notes = "接口发布说明",
			httpMethod = "POST")
	@RequestMapping("/updateResp")
	public String updateResp(@RequestParam("ebsAssId") String ebsAssId,@RequestParam("personId") String personId,@RequestParam("thisKid") String thisKid){

		AssignSeniorKeyResp temp=service.getSelecInfo(Integer.parseInt(thisKid));
		//long operatorId = SessionUtils.getCurrentUserId(request);
		Long operatorId=1L;
		PosEmpElementInfo info=new PosEmpElementInfo();
		if(null!=ebsAssId&&(!"".equals(ebsAssId))){
			info.setEbsAssId(Long.parseLong(ebsAssId));
		}
		if(null!=personId&&(!"".equals(personId))){
			info.setPersonId(Long.parseLong(personId));
		}
		info.setCreatedBy(operatorId);
		info.setLastUpdatedBy(operatorId);
		info.setRoleId("20");
		if(null!=temp&&(null!=temp.getSkStr())){
			info.setSubRespStr(temp.getSkStr());
		}
		if(null!=temp&&(null!=temp.getIdStr())){
			info.setUseConcatenate(temp.getIdStr());
		}
		info.setWeight(100L);
		if(null!=thisKid&&(!"".equals(thisKid))){
			if(0!=Long.parseLong(thisKid)){
				info.setElementId(Long.parseLong(thisKid));
			}
		}
		service.saveEmpAssKeyrespInfo(Long.parseLong(ebsAssId), Long.parseLong(personId), operatorId, info);
		return "success";
	}

	/**
	 *描述: (查询职位管理-集团)
	 *
	 *@return
	 */
	@ApiOperation(
			value = "查询职位管理-集团",
			notes = "接口发布说明",
			httpMethod = "POST")
	@RequestMapping("/getPositionJT")
	public Map getPositionJT(@RequestParam("orgId") String orgIdStr,@RequestParam("kid") String kidStr,
							   @RequestParam(value = "level",required = false) String levelStr,@RequestParam("pageSzie") String pageSzie,@RequestParam("pageNum") String pageNum
	){

		int orgId = -9999;
		if (null != orgIdStr && (!"".equals(orgIdStr.trim()))) {
			orgId = Integer.parseInt(orgIdStr);
		}
		long level = 0;
		if (null != levelStr && (!"".equals(levelStr.trim()))) {
			level = Long.parseLong(levelStr);
		}
		long kid = 0;
		if (null != kidStr && (!"".equals(kidStr.trim()))) {
			kid = Long.parseLong(kidStr);
		}
		long rangeId = 12895;
		int pSize=Integer.parseInt(pageSzie);
		int pNum=Integer.parseInt(pageNum);
		int pstart=(pNum-1)*pSize;
		/*处理orgId*/
		List<List<Integer>> idList=service.getOrgIdList(orgId);
        List<Integer> newList = new ArrayList<>();
		for (int i = 0; i < idList.size(); i++) {
			for (int j = 0; j < idList.get(i).size(); j++) {
				newList.add(idList.get(i).get(j));
			}
		}
		System.out.println(newList);
        Map<String, Object> map = new HashMap<>();
        List<AssignSeniorKeyResp> data=service.selectPositionJT(newList, level, kid,rangeId,pSize,pstart);
        int total = service.countPositionJT(newList, level, kid,rangeId);
        map.put("data", data);
        map.put("total", total);
        return map;
	}


    /**
     *描述: (查询全部记录-集团)
     *
     *@return
     */
    @ApiOperation(
            value = "查询全部记录-集团",
            notes = "接口发布说明",
            httpMethod = "POST")
    @RequestMapping("/getAllDetailJT")
    public List<AssignSeniorKeyResp> getAllDetailJT(@RequestParam("assignMentId") String assignMentId){

        List<AssignSeniorKeyResp>  list=new ArrayList<>();
        if(null!=assignMentId&&(!"".equals(assignMentId))){
            list=service.getAllDetailJT(Integer.parseInt(assignMentId));
        }
        return list;
    }
}




