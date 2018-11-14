package cn.chinaunicom.PosStandardpos.controller;


import cn.chinaunicom.PosStandardpos.entity.Lookups;
import cn.chinaunicom.PosStandardpos.entity.PosJposV;
import cn.chinaunicom.PosStandardpos.entity.PosTreeV;
import cn.chinaunicom.PosStandardpos.service.LookupsService;
import cn.chinaunicom.PosStandardpos.service.PosJposVService;
import cn.chinaunicom.PosStandardpos.service.PosTreeVService;
import cn.chinaunicom.common.FileUtil;
import cn.chinaunicom.duty.entity.PosElement;
import cn.chinaunicom.duty.service.PosElementService;
import cn.chinaunicom.platform.utils.MessageResponse;

import com.baomidou.mybatisplus.plugins.Page;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * **************************************
 * 描述: VIEW
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author zhangchi 
 * @since 2018-11-06
 * @version V1.0
 * **************************************
 */
@Api(value = "PosJposVController", tags = "VIEW")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/posJposV")
public class PosJposVController {

	@Autowired
    PosJposVService service;
	@Autowired
    LookupsService lookupService;
	@Autowired
	PosElementService posElementService;
	@Autowired
	PosTreeVService posTreeVService;
	
	@ApiOperation(value = "VIEW列表", notes = "VIEW列表", response = PosJposV.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取数据成功",
                    response = Page.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到数据"
            )
    })
    @GetMapping("/list")
    public ResponseEntity<Object> getPosJposVList(){
		List<PosJposV> list = service.getPosJposVList();
        if(list==null) {
            list = new ArrayList<PosJposV>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
	
	@ApiOperation(value = "保存VIEW", notes = "保存VIEW", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "添加成功"
	         )
	})
	@PostMapping("/save")
	public ResponseEntity<Object> savePosJposV(@RequestBody PosJposV entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.savePosJposV(entity);
        if(i>0) {
        	vo.setMsg("添加成功");
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    
    @ApiOperation(value = "更新VIEW", notes = "更新VIEW", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "添加成功"
	         )
	})
	@PostMapping("/update")
	public ResponseEntity<Object> updatePosJposV(@RequestBody PosJposV entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.updatePosJposV(entity);
        if(i>0) {
        	vo.setMsg("更新成功");
        }else {
        	vo.setMsg("更新失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    
    @ApiOperation(value = "删除VIEW", notes = "删除VIEW", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "删除成功"
	         )
	})
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deletePosJposV(@PathVariable("id") Long id){
		MessageResponse vo = new MessageResponse();
        Integer i = service.deletePosJposV(id);
        if(i>0) {
        	vo.setMsg("删除成功");
        }else {
        	vo.setMsg("删除失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }


	@ApiOperation(value = "查看省基准岗位", notes = "VIEW列表", response = PosJposV.class, httpMethod = "GET")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
			@ApiResponse(
					code = 200,
					message = "获取数据成功",
					response = Page.class
			),
			@ApiResponse(
					code = 404,
					message = "未查询到数据"
			)
	})
	/**
	 * 省基准岗位查询
	 */
	@GetMapping("/Poslist")
	public ResponseEntity<Object> searchProvincePostList(
			@RequestParam(
					value = "respId",
					required = false) String respId,
			@RequestParam(
					value = "state",
					required = false) String state,
			@RequestParam(
					value = "posCateId",
					required = false) String posCateId,
			@RequestParam(
					value = "posSubcateId",
					required = false) String posSubcateId,
			@RequestParam(
					value = "posName",
					required = false) String posName,
			@RequestParam(
					value = "coreFlag",
					required = false) String coreFlag,
			@RequestParam(
					value = "levelCode",
					required = false) String levelCode,
			@RequestParam(
					value = "orgLevelS",
					required = false) String orgLevelS,
			@RequestParam(
					value = "orgLevelD",
					required = false) String orgLevelD,
			@RequestParam(
					value = "orgLevelX",
					required = false) String orgLevelX,
			@RequestParam(
					value = "educationDegree",
					required = false) String educationDegree,
			@RequestParam(
					value = "effFlag",
					required = false) String effFlag,

			@RequestParam(
					value = "currentPageNum") int currentPageNum,
			@RequestParam(
					value = "recordNum") int recordNum

	){

		HashMap<Object, Object> params = new HashMap<>();
		params.put("respId", respId);
		params.put("state", state);// 职责范围字段,element_id拼接出来
		params.put("posCateId", posCateId);
		params.put("posSubcateId", posSubcateId);
		params.put("posName", posName);
		params.put("coreFlag", coreFlag);
		params.put("levelCode", levelCode);
		params.put("orgLevelS", orgLevelS);
		params.put("orgLevelD", orgLevelD);
		params.put("orgLevelX", orgLevelX);

		params.put("educationDegree", educationDegree);//需传入degreeCode字段值
		 params.put("coreFlag", coreFlag);
		params.put("effFlag", effFlag);
		Integer rangeId= 12808;
		params.put("rangeId", rangeId);
		Page<PosJposV> objectPage = new Page<>(currentPageNum, recordNum);
		List<PosJposV> list = service.searchProvincePostList(objectPage, params);

		List<Lookups> eduList = lookupService.findTypeItemInfos("EHRCUC_POS_EDUCATION_DEGREE");
		List<PosElement> cateList = posElementService.getCateList();
		List<PosTreeV> subcateList = posTreeVService.getSubcateList(params);
		//System.out.println(eduList.get(0).getElementName()+"***************************");
		System.out.println(subcateList.get(0).getMname()+"***************************");
		HashMap<Object, Object> objectHashMap = new HashMap<>();
		objectHashMap.put("list",list);
		objectHashMap.put("eduList",eduList);
		objectHashMap.put("cateList",cateList);
		objectHashMap.put("subcateList",subcateList);
		objectHashMap.put("respId", respId);
		objectHashMap.put("flag", "S");
		objectHashMap.put("state", state);
		objectHashMap.put("eFlag", effFlag);
		return new ResponseEntity<>(objectHashMap, HttpStatus.OK);
	}


	@ApiOperation(value = "导出省基准岗位", notes = "导出省基准岗位", response = PosJposV.class, httpMethod = "GET",produces="application/octet-stream")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
			@ApiResponse(
					code = 200,
					message = "获取数据成功",
					response = Page.class
			),
			@ApiResponse(
					code = 404,
					message = "未查询到数据"
			)
	})
	/**
	 * 省基准岗位导出
	 */
	@GetMapping("/outExl")
	public void outExl(

			@RequestParam(
					value = "posCateId",
					required = false) String posCateId,
			@RequestParam(
					value = "posSubcateId",
					required = false) String posSubcateId,
			@RequestParam(
					value = "posName",
					required = false) String posName,
			@RequestParam(
					value = "coreFlag",
					required = false) String coreFlag,

			@RequestParam(
					value = "orgLevelS",
					required = false) String orgLevelS,
			@RequestParam(
					value = "orgLevelD",
					required = false) String orgLevelD,
			@RequestParam(
					value = "orgLevelX",
					required = false) String orgLevelX,
			@RequestParam(
					value = "educationDegree",
					required = false) String educationDegree,
			@RequestParam(
					value = "mFlag",
					required = false) String mFlag	,
			@RequestParam(
					value = "eFlag",
					required = false) String eFlag,
					HttpServletResponse resp

	){
		Map<String,Object> params=new HashMap<String, Object>();
		Integer rangeId= 12808;
		params.put("rangeId", rangeId);
		params.put("posCateId", posCateId);
		params.put("posSubcateId", posSubcateId);
		params.put("posName", posName);
		params.put("mFlag", mFlag);
		params.put("orgLevelS", orgLevelS);
		params.put("orgLevelD", orgLevelD);
		params.put("orgLevelX", orgLevelX);
		params.put("coreFlag", coreFlag);
		params.put("educationDegree", educationDegree);
		params.put("eFlag", eFlag);
		List<PosJposV> postList = new ArrayList<PosJposV>();
		postList = service.getPostListForExcel(params);
		String fileName = "省基准岗位表.xls";
		String sheetName= "省基准岗位表";
		FileUtil.exportExcel(postList,sheetName,sheetName, PosJposV.class,fileName,resp);
	}

	@ApiOperation(value = "省基准岗位维护", notes = "省基准岗位维护", response = PosJposV.class, httpMethod = "GET",produces="application/octet-stream")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
			@ApiResponse(
					code = 200,
					message = "获取数据成功",
					response = Page.class
			),
			@ApiResponse(
					code = 404,
					message = "未查询到数据"
			)
	})
	/**
	 * 省基准岗位维护
	 */
	@GetMapping("/PosGrouplist")
	public ResponseEntity<Object> searchGroupPostList(
			@RequestParam(
					value = "respId",
					required = false) String respId,
			@RequestParam(
					value = "state",
					required = false) String state,
			@RequestParam(
					value = "posCateId",
					required = false) String posCateId,
			@RequestParam(
					value = "posSubcateId",
					required = false) String posSubcateId,
			@RequestParam(
					value = "posName",
					required = false) String posName,
			@RequestParam(
					value = "coreFlag",
					required = false) String coreFlag,
			@RequestParam(
					value = "levelCode",
					required = false) String levelCode,
			@RequestParam(
					value = "orgLevelS",
					required = false) String orgLevelS,
			@RequestParam(
					value = "orgLevelD",
					required = false) String orgLevelD,
			@RequestParam(
					value = "orgLevelX",
					required = false) String orgLevelX,
			@RequestParam(
					value = "educationDegree",
					required = false) String educationDegree,
			@RequestParam(
					value = "effFlag",
					required = false) String effFlag,
			@RequestParam(
					value = "setFlag",
					required = false) String setFlag,

			@RequestParam(
					value = "currentPageNum") int currentPageNum,
			@RequestParam(
					value = "recordNum") int recordNum

	){


		HashMap<Object, Object> params = new HashMap<>();
		params.put("respId", respId);
		params.put("state", state);// 职责范围字段,element_id拼接出来
		params.put("posCateId", posCateId);
		params.put("posSubcateId", posSubcateId);
		params.put("posName", posName);
		params.put("coreFlag", coreFlag);
		params.put("levelCode", levelCode);
		params.put("orgLevelS", orgLevelS);
		params.put("orgLevelD", orgLevelD);
		params.put("orgLevelX", orgLevelX);

		params.put("educationDegree", educationDegree);//需传入degreeCode字段值
		params.put("coreFlag", coreFlag);
		params.put("effFlag", effFlag);
		Integer rangeId= 12808;
		params.put("rangeId", rangeId);
		params.put("mFlag", setFlag);
		Page<PosJposV> objectPage = new Page<>(currentPageNum, recordNum);
		List<PosJposV> list = service.searchGroupPostList(objectPage, params);
		Integer num=service.searchGroupPostListCount(params);
		List<Lookups> eduList = this.lookupService.findTypeItemInfos("EHRCUC_POS_EDUCATION_DEGREE");
		List<PosElement> cateList = posElementService.getCateList();
		List<PosTreeV> subcateList = posTreeVService.getSubcateList(params);

		HashMap<Object, Object> objectHashMap = new HashMap<>();
		objectHashMap.put("list",list);
		objectHashMap.put("num",num);

		objectHashMap.put("eduList",eduList);
		objectHashMap.put("cateList",cateList);
		objectHashMap.put("subcateList",subcateList);
		objectHashMap.put("respId", respId);
		objectHashMap.put("flag", "S");
		objectHashMap.put("state", state);
		objectHashMap.put("eFlag", effFlag);


		return new ResponseEntity<>(objectHashMap, HttpStatus.OK);
	}


	@ApiOperation(value = "导出集团基准岗位", notes = "导出集团基准岗位", response = PosJposV.class, httpMethod = "GET",produces="application/octet-stream")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
			@ApiResponse(
					code = 200,
					message = "获取数据成功",
					response = Page.class
			),
			@ApiResponse(
					code = 404,
					message = "未查询到数据"
			)
	})
	/**
	 * 集团岗位导出
	 */
	@GetMapping("/exportPosList")
	public void exportPosList(

			@RequestParam(
					value = "posCateId",
					required = false) String posCateId,
			@RequestParam(
					value = "posSubcateId",
					required = false) String posSubcateId,
			@RequestParam(
					value = "posName",
					required = false) String posName,
			@RequestParam(
					value = "coreFlag",
					required = false) String coreFlag,

			@RequestParam(
					value = "orgLevelS",
					required = false) String orgLevelS,
			@RequestParam(
					value = "orgLevelD",
					required = false) String orgLevelD,
			@RequestParam(
					value = "orgLevelX",
					required = false) String orgLevelX,
			@RequestParam(
					value = "educationDegree",
					required = false) String educationDegree,
			@RequestParam(
					value = "expTemplet",
					required = false) String expTemplet,
			@RequestParam(
					value = "mFlag",
					required = false) String mFlag	,
			@RequestParam(
					value = "eFlag",
					required = false) String eFlag,
			HttpServletResponse resp

	){

		String fileName = "集团基准岗位表.xls";
		if(expTemplet!=null&&expTemplet.equals("J")){
			fileName = "省基准岗位导入模版.xls";
		}
		Map<String,Object> params=new HashMap<String, Object>();
		Integer rangeId= 12808;
		params.put("rangeId", rangeId);
		params.put("posCateId", posCateId);
		params.put("posSubcateId", posSubcateId);
		params.put("posName", posName);
		params.put("expTemplet", expTemplet);
		params.put("mFlag", mFlag);
		params.put("eFlag", eFlag);
		params.put("orgLevelS", orgLevelS);
		params.put("orgLevelD", orgLevelD);
		params.put("orgLevelX", orgLevelX);
		params.put("coreFlag", coreFlag);
		params.put("educationDegree", educationDegree);

		List<PosJposV> postList = new ArrayList<PosJposV>();
		postList = service.getPostListForExcel2(params);
		String sheetName= "集团基准岗位表";
		FileUtil.exportExcel(postList,sheetName,sheetName, PosJposV.class,fileName,resp);
	}

}

