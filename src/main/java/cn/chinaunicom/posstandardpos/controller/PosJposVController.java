package cn.chinaunicom.posstandardpos.controller;


import cn.chinaunicom.posstandardpos.entity.*;
import cn.chinaunicom.posstandardpos.service.*;
import cn.chinaunicom.common.FileUtil;
import cn.chinaunicom.duty.entity.PosElement;
import cn.chinaunicom.duty.service.PosElementService;
import cn.chinaunicom.platform.utils.MessageResponse;

import com.baomidou.mybatisplus.plugins.Page;
import io.swagger.annotations.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaError;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * **************************************
 * 描述: VIEW
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author zhangchi 
 * @since 2018-11-06
 * @version V1.0
 * **************************************
 */
@Api(value = "PosJposVController", tags = "省、集团基准岗位相关")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/posJposV")
public class PosJposVController {
	private final static String XLS ="xls";
	private final static String XLSX ="xlsx";

	@Autowired
	PosJposVService service;
	@Autowired
	LookupsService lookupService;
	@Autowired
	PosElementService posElementService;
	@Autowired
	PosTreeVService posTreeVService;
	@Autowired
	PosPosElementService posPosElementService;
	@Autowired
	PosStandardposService posStandardposService;
	@Autowired
	PosSposVService posSposVService;

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
	public ResponseEntity<Object> getPosJposVList() {
		List<PosJposV> list = service.getPosJposVList();
		if (list == null) {
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
	public ResponseEntity<Object> savePosJposV(@RequestBody PosJposV entity) {
		MessageResponse vo = new MessageResponse();
		Integer i = service.savePosJposV(entity);
		if (i > 0) {
			vo.setMsg("添加成功");
		} else {
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
	public ResponseEntity<Object> updatePosJposV(@RequestBody PosJposV entity) {
		MessageResponse vo = new MessageResponse();
		Integer i = service.updatePosJposV(entity);
		if (i > 0) {
			vo.setMsg("更新成功");
		} else {
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
	public ResponseEntity<Object> deletePosJposV(@PathVariable("id") Long id) {
		MessageResponse vo = new MessageResponse();
		Integer i = service.deletePosJposV(id);
		if (i > 0) {
			vo.setMsg("删除成功");
		} else {
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
					value = "educationDegree",
					required = false) String educationDegree,
			@RequestParam(
					value = "effFlag",
					required = false) String effFlag,

			@RequestParam(
					value = "currentPageNum") int currentPageNum,
			@RequestParam(
					value = "recordNum") int recordNum

	) {

		HashMap<Object, Object> params = new HashMap<>();
		params.put("respId", respId);
		params.put("state", state);// 职责范围字段,element_id拼接出来
		params.put("posCateId", posCateId);
		params.put("posSubcateId", posSubcateId);
		params.put("posName", posName);
		params.put("coreFlag", coreFlag);
		//	params.put("levelCode", levelCode);
		String[] split = levelCode.split(",");
		String orgLevelS = null;
		String orgLevelD = null;
		String orgLevelX = null;
		for (String s : split) {
			if (s.equals("s")) {
				orgLevelS = s;
			}
			if (s.equals("d")) {
				orgLevelD = s;
			}
			if (s.equals("x")) {
				orgLevelX = s;
			}
		}
		params.put("orgLevelS", orgLevelS);
		params.put("orgLevelD", orgLevelD);
		params.put("orgLevelX", orgLevelX);

		params.put("educationDegree", educationDegree);//需传入degreeCode字段值
		params.put("coreFlag", coreFlag);
		params.put("effFlag", effFlag);
		Integer rangeId = 12808;
		params.put("rangeId", rangeId);
		Page<PosJposV> objectPage = new Page<>(currentPageNum, recordNum);//分页条件查询
		List<PosJposV> list = service.searchProvincePostList(objectPage, params);//总条数
		Integer sums = posSposVService.searchProvincePostListCount(params);
		List<Lookups> eduList = lookupService.findTypeItemInfos("EHRCUC_POS_EDUCATION_DEGREE");
		List<PosElement> cateList = posElementService.getCateList();
		List<PosTreeV> subcateList = posTreeVService.getSubcateList(params);


		HashMap<Object, Object> objectHashMap = new HashMap<>();
		objectHashMap.put("list", list);
		objectHashMap.put("sums", sums);
		objectHashMap.put("eduList", eduList);
		objectHashMap.put("cateList", cateList);
		objectHashMap.put("subcateList", subcateList);
		objectHashMap.put("respId", respId);
		objectHashMap.put("flag", "S");
		objectHashMap.put("state", state);
		objectHashMap.put("eFlag", effFlag);
		return new ResponseEntity<>(objectHashMap, HttpStatus.OK);
	}


	@ApiOperation(value = "导出省基准岗位", notes = "导出省基准岗位", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
					required = false) String mFlag,
			@RequestParam(
					value = "eFlag",
					required = false) String eFlag,
			HttpServletResponse resp

	) {
		Map<String, Object> params = new HashMap<String, Object>();
		Integer rangeId = 12808;
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
		String sheetName = "省基准岗位表";
		FileUtil.exportExcel(postList, sheetName, sheetName, PosJposV.class, fileName, resp);
	}

	@ApiOperation(value = "查看省基准岗位详细信息", notes = "查看省基准岗位详细信息", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
	 *  查看省基准岗位详细信息
	 */
	@GetMapping("/checkProvincePostView")
	public ResponseEntity<Object> checkProvincePostView(

			@RequestParam(
					value = "posid",
					required = false) Long posid,
			@RequestParam(
					value = "educationDegree",
					required = false) String educationDegree

	) {
		PosStandardpos posstandardposinfo = new PosStandardpos();
		//设置查询参数
		Map<String, Object> map = new HashMap<String, Object>();//创建map
		map.put("posid", posid);
		map.put("educationDegree", educationDegree);

		List<Lookups> eduList = lookupService.findTypeItemInfos("EHRCUC_POS_EDUCATION_DEGREE");

		posstandardposinfo = posStandardposService.checkProvincePostView(map);
		List<PosStandardpos> kstrList = posStandardposService.searchProvincePostDutyById(map);
		HashMap<Object, Object> objectHashMap = new HashMap<>();
		objectHashMap.put("orgLevel", posstandardposinfo.getLevelCode());
		objectHashMap.put("posstandardposinfo", posstandardposinfo);
		objectHashMap.put("kstrList", kstrList);
		objectHashMap.put("educationDegree", educationDegree);
		objectHashMap.put("eduList", eduList);
		return new ResponseEntity<>(objectHashMap, HttpStatus.OK);
	}

	@ApiOperation(value = "省基准岗位维护", notes = "省基准岗位维护", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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

	) {


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
		Integer rangeId = 12808;
		params.put("rangeId", rangeId);
		params.put("mFlag", setFlag);
		Page<PosJposV> objectPage = new Page<>(currentPageNum, recordNum);
		List<PosJposV> list = service.searchGroupPostList(objectPage, params);
		Integer num = service.searchGroupPostListCount(params);
		List<Lookups> eduList = lookupService.findTypeItemInfos("EHRCUC_POS_EDUCATION_DEGREE");
		List<PosElement> cateList = posElementService.getCateList();
		List<PosTreeV> subcateList = posTreeVService.getSubcateList(params);

		HashMap<Object, Object> objectHashMap = new HashMap<>();
		objectHashMap.put("list", list);
		objectHashMap.put("num", num);

		objectHashMap.put("eduList", eduList);
		objectHashMap.put("cateList", cateList);
		objectHashMap.put("subcateList", subcateList);
		objectHashMap.put("respId", respId);
		objectHashMap.put("flag", "S");
		objectHashMap.put("state", state);
		objectHashMap.put("eFlag", effFlag);


		return new ResponseEntity<>(objectHashMap, HttpStatus.OK);
	}


	@ApiOperation(value = "导出集团基准岗位", notes = "导出集团基准岗位", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
					required = false) String mFlag,
			@RequestParam(
					value = "eFlag",
					required = false) String eFlag,
			HttpServletResponse resp

	) {

		String fileName = "集团基准岗位表.xls";
		if (expTemplet != null && expTemplet.equals("J")) {
			fileName = "省基准岗位导入模版.xls";
		}
		Map<String, Object> params = new HashMap<String, Object>();
		Integer rangeId = 12808;
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


		List<PosJposV> postList = service.getPostListForExcell(params);
		String sheetName = "集团基准岗位表";
		FileUtil.exportExcel(postList, sheetName, sheetName, PosJposV.class, fileName, resp);
	}

	@ApiOperation(value = "查看岗位职责", notes = "查看岗位职责", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
	 * 查看基准岗位职责
	 * @return
	 */
	@GetMapping("/getPosElementById")
	public List<posiVo> getPosElementById(
			@RequestParam(
					value = "posId"
			) String posId
	) {

		List<posiVo> eleList = null;
		if (posId != null && !"".equals(posId)) {
			eleList = service.selectElebyPosId(posId);
		}

		return eleList;
	}

	@ApiOperation(value = "基准岗位职责定制", notes = "基准岗位职责定制+", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
	 * 基准岗位职责定制（+）
	 */
	@GetMapping("/getProvincePostList")
	public ResponseEntity<Object> getProvincePostList(
			@RequestParam(
					value = "posId"
			) String posId,
			@RequestParam(
					value = "respId",
					required = false) String respId,
			@RequestParam(
					value = "eFlag",
					required = false) String eFlag

	) {
		long rangeId = 12808;
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("parentPosId", posId);
		params.put("rangeId", rangeId);
		params.put("eFlag", eFlag);
		List<PosStandardpos> postList = new ArrayList<PosStandardpos>();

		postList = service.getProvincePostList(params);

		return new ResponseEntity<>(postList, HttpStatus.OK);
	}

	@ApiOperation(value = "获取岗位职责", notes = "获取岗位职责", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
	 * 获取岗位职责(左侧)
	 * @param posId
	 * @param respId
	 * @param parentPosId
	 * @return
	 */
	@GetMapping("/selectPosElementById")
	public ResponseEntity<Object> selectPosElementById(
			@RequestParam(
					value = "posId"
			) String posId,
			@RequestParam(
					value = "respId",
					required = false) String respId,
			@RequestParam(
					value = "parentPosId",
					required = false) String parentPosId

	) {

		long rangeId = 12808;
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("parentPosId", parentPosId);
		params.put("rangeId", rangeId);
		String skids = "";
		List<PosPosElement> parentPosList = posPosElementService.getElementById(params);
		if (parentPosList != null && parentPosList.size() > 0) {
			for (int i = 0; i < parentPosList.size(); i++) {
				skids = skids + parentPosList.get(i).getSkid();
				skids = skids + ",";
			}
			if (skids.endsWith(",")) {
				skids = skids.substring(0, skids.length() - 1);
			}
		}

		List<PosTreeV> mList = null;
		String empKeyresp = "";//已分配子职责
		if (posId != null && !"".equals(posId)) {
			//判断该岗位是否分配职责
			List<PosPosElement> eleList = posPosElementService.selectElebyPosId(posId);
			if (eleList != null && eleList.size() > 0) {
				for (PosPosElement posPosElement : eleList) {
					empKeyresp = empKeyresp + posPosElement.getKid() + "-" + posPosElement.getSkid();
					empKeyresp = empKeyresp + ".";
				}
				if (empKeyresp.endsWith(".")) {
					empKeyresp = empKeyresp.substring(0, empKeyresp.length() - 1);
				}
				mList = posTreeVService.getMListById(posId);
//				List<Object> objec = new ArrayList<>();
//				for(PosTreeV  pm : mList){
//					objec.add(pm.getMid());
//				}
//				List<PosTreeV> kList = posTreeVService.getKListsByMId(objec, posId);
//
//				List<Object> objec2 = new ArrayList<>();
//				for (PosTreeV pk :kList) {
//					objec2.add(pk.getKid());
//				}
//				List<PosTreeV> skList = posTreeVService.getSkListsByKId(objec2, posId);
//
//				for (PosTreeV posTreeV : mList) {
//
//					Long mid = posTreeV.getMid();
//					if(mid!=null && !"".equals(mid+"")){
//					List<PosTreeV> objects = new ArrayList<>();
//					for (PosTreeV treeV : kList) {
//
//						Long kid = treeV.getKid();
//						if(kid!=null&& !"".equals(kid+"")){
//							List<PosTreeV> objects2 = new ArrayList<>();
//							for (PosTreeV tre : skList) {
//								if ( tre.getKid().equals(kid)) {
//									objects2.add(tre);
//								}
//							}
//							treeV.setSkList(objects2);
//						}
//						if (treeV.getMid().equals(mid)) {
//							objects.add(treeV);
//						}
//					}
//					posTreeV.setkList(objects);
//				}
//
//				}


				if (mList != null && mList.size() > 0) {
					for (PosTreeV posTreeV : mList) {
						List<PosTreeV> kList = posTreeVService.getKListByMId(posTreeV.getMid(), posId);

						if (kList != null && kList.size() > 0) {
							posTreeV.setkList(kList);

							for (PosTreeV kInfo : kList) {
								//String subRespStr = "";//当前关键职责的子职责
								List<PosTreeV> skList = posTreeVService.getSkListByKId(kInfo.getKid(), posId);

								if (skList != null && skList.size() > 0) {
									kInfo.setkList(skList);
								}

							}
						}

					}
				}
				HashMap<Object, Object> objectHashMap = new HashMap<>();
				objectHashMap.put("isExistAss", 1);//1表示存在
				objectHashMap.put("empKeyresp", empKeyresp);
				objectHashMap.put("mList", mList);
				objectHashMap.put("posId", posId);
				objectHashMap.put("skids", skids);
				return new ResponseEntity<>(objectHashMap, HttpStatus.OK);
			} else {
				mList = posTreeVService.getMListById(posId);
				if (mList != null && mList.size() > 0) {
					int i = 0;
					for (PosTreeV mInfo : mList) {
						i++;
						//查询关键职责
						List<PosTreeV> kList = posTreeVService.getKListByMId(mInfo.getMid(), posId);
						mInfo.setkList(kList);
						if (i > 1) {
							break;
						}
					}
				}
				HashMap<Object, Object> objectHashMap = new HashMap<>();
				objectHashMap.put("empKeyresp", empKeyresp);
				objectHashMap.put("mList", mList);
				objectHashMap.put("posId", posId);
				objectHashMap.put("skids", skids);
				return new ResponseEntity<>(objectHashMap, HttpStatus.OK);

			}
		} else {
			HashMap<Object, Object> objectHashMap = new HashMap<>();
			objectHashMap.put("empKeyresp", empKeyresp);
			objectHashMap.put("mList", mList);
			objectHashMap.put("posId", posId);
			objectHashMap.put("skids", skids);
			return new ResponseEntity<>(objectHashMap, HttpStatus.OK);
			//return mapping.findForward("com.cuc.eHR.PositionSystem.action.PosStandardposAction.selectPosElementById");
		}

	}

	@ApiOperation(value = " 获取职责列表（右）", notes = " 获取职责列表（右）", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
	 * 获取职责列表（右）
	 */
	@GetMapping("/selectPosElementsById")
	public ResponseEntity<Object> selectPosElementsById(
			@RequestParam(
					value = "posId"
			) String posId,
			@RequestParam(
					value = "respId",
					required = false) String respId,
			@RequestParam(
					value = "parentPosId",
					required = false) String parentPosId

	) {
		long rangeId = 12808;
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("rangeId", rangeId);
		params.put("parentPosId", parentPosId);
		params.put("posId", posId);
		String skids = "";
		List<PosPosElement> parentPosList = posPosElementService.getElementById(params);
		if (parentPosList != null && parentPosList.size() > 0) {
			for (int i = 0; i < parentPosList.size(); i++) {
				skids = skids + parentPosList.get(i).getSkid();
				skids = skids + ",";
			}
			if (skids.endsWith(",")) {
				skids = skids.substring(0, skids.length() - 1);
			}
		}
		List<PosPosElement> eleList = null;
		if (posId != null && !"".equals(posId)) {
			eleList = posPosElementService.selectElebyPosId(posId);
		}
		PosStandardpos info = posStandardposService.getPostInfoById(params);
		Map<String, Object> paramss = new HashMap<String, Object>();
		paramss.put("eleList", eleList);
		paramss.put("posId", posId);
		paramss.put("skids", skids);
		paramss.put("rate", info.getAttribute1());

		return new ResponseEntity<>(paramss, HttpStatus.OK);
	}

	@ApiOperation(value = " 根据ID查询基准岗位信息（定制按钮）", notes = " 根据ID查询基准岗位信息（定制按钮）", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
	 * 根据ID查询基准岗位信息（定制按钮）
	 */
	@GetMapping("/getPosInfoById")
	public ResponseEntity<Object> getPosInfoById(
			@RequestParam(value = "posId") String posId
	) {
		PosStandardpos posStandardpos = new PosStandardpos();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("posId", posId);
		posStandardpos = posStandardposService.getPosInfoById(params);

		return new ResponseEntity<>(posStandardpos, HttpStatus.OK);

	}

	@ApiOperation(value = " 获取第二层菜单", notes = " 获取第二层菜单", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
	 * 获取第二层菜单
	 * 获取关键职责
	 */
	@GetMapping("/getKListByMId")
	public ResponseEntity<Object> getKListByMId(
			@RequestParam(
					value = "posId"
			) String posId,
			@RequestParam(
					value = "mid"
			) String mid
	) {

		List<PosTreeV> kList = new ArrayList<PosTreeV>();

		kList = posTreeVService.getKListByMId(Long.valueOf(mid), posId);

		return new ResponseEntity<>(kList, HttpStatus.OK);
	}


	@ApiOperation(value = " 获取第三层菜单", notes = " 获取第三层菜单", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
	 * 获取第三层菜单
	 * 获取关键职责
	 */
	@GetMapping("/getSkListByKId")
	public ResponseEntity<Object> getSkListByKId(
			@RequestParam(
					value = "posId"
			) String posId,
			@RequestParam(
					value = "kid"
			) String kid
	) {

		List<PosTreeV> skList = new ArrayList<PosTreeV>();
		if (kid != null && !"".equals(kid)) {
			skList = posTreeVService.getSkListByKId(Long.valueOf(kid), posId);
		}

		return new ResponseEntity<>(skList, HttpStatus.OK);
	}


	@ApiOperation(value = " 根据省基准岗位ID删除岗位信息", notes = " 根据省基准岗位ID删除岗位信息", response = PosJposV.class, httpMethod = "GET", produces = "application/octet-stream")
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
/***
 * 根据省基准岗位ID删除岗位信息
 */
	@DeleteMapping ("/deletePosInfo")
	public ResponseEntity<Object> deletePosInfo(
			@RequestParam(
					value = "posId"
			) String posId,
			@RequestParam(
					value = "respId"
			) String respId,
			@RequestParam(
					value = "parentPosId"
			) String parentPosId,
			HttpServletResponse response
	) throws IOException {

		long rangeId = 12808;
		long provinceOrgId = -9999;
//		String orgId = String.valueOf(SessionUtils.getCurrentUser(request).getOrganId());
//		OrganizationInfo organizationInfo = OrganizationUtils.findOrg(Long.parseLong(orgId));
//		Long provinceOrgId = organizationInfo!=null?organizationInfo.getOrg5():-9999;
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("orgId", provinceOrgId);
		params.put("posId", posId);
		params.put("rangeId", rangeId);
		params.put("parentPosId", parentPosId);
		Integer flag = posStandardposService.findProvincePostById(params);


		if (flag > 0) {
			params = null;
			params.put("state", "1");
			return new ResponseEntity<>(params, HttpStatus.OK);
		} else {
			posStandardposService.deletePosInfo(params);
			params = null;
			params.put("state", "0");
			return new ResponseEntity<>(params, HttpStatus.OK);

		}

	}


	@ApiOperation(value = " 批量修改省基准岗位信息", notes = " 批量修改省基准岗位信息", response = PosJposV.class,  produces = "application/octet-stream")
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
/***
 * 批量修改省基准岗位信息
 */
	@PutMapping("/updatePosInfos")
	public void updatePosInfos(
			@RequestParam(
					value = "respId",
					required = false
			) String respId,

			@RequestBody List<Map<String, Object>> params

	) {

		long rangeId = 12808;//暂时写死
		long provinceOrgId = 5;//暂时写死
		long operatorId=3;//暂时写死
		List<Map<String, Object>> addParams = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> updateParams = new ArrayList<Map<String, Object>>();
		if (params != null && !"".equals(params)) {
			for (Map<String, Object> param : params) {
				param.put("operatorId", operatorId);
				param.put("orgId", provinceOrgId);
				//新增时岗位匹配率为100
				param.put("attribute1", "100");
				if (param.get("posId")!=null&&!"".equals(param.get("posId"))) {

					updateParams.add(param);

				} else {
					addParams.add(param);
				}
			}
		}
	posStandardposService.updatePosInfos(addParams, updateParams, operatorId);

	}


	@ApiOperation(value = " 省基准岗位批量导入", notes = " 省基准岗位批量导入", response = PosJposV.class,  produces = "application/octet-stream")
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
/***
 * 省基准岗位批量导入
 */
	@PutMapping("/importSpostInfos")
	public ResponseEntity<String> importSpostInfos(@RequestParam(value = "filePath", required = false) String filePath) {
		String result="";
		long orgId=96042;
		long currentUserId=10;
		try {
		//获取输入流
		FileInputStream fis = new FileInputStream(filePath);
		if(filePath.endsWith(XLS)) {
			//2003
			//创建HSSF
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			//获取总页数
			int sheetCount = workbook.getNumberOfSheets();
			for(int i=0;i<sheetCount;i++){
				List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
				//获取sheet页
				HSSFSheet sheets =  workbook.getSheetAt(i);
				//获取sheet使用行数
				int rowCount = sheets.getPhysicalNumberOfRows();
				//从第3行开始读取数据
				for(int j=1;j<rowCount;j++){
					HSSFRow row = sheets.getRow(j);
					Map<String , Object> data = new HashMap<String, Object>();
					//获取一行记录
					//集团基准岗位
					HSSFCell cell0= row.getCell(0);
					String jPost = getCellValue(cell0)==null?"":getCellValue(cell0);
					data.put("jPost", jPost);
					//省基准岗位
					HSSFCell cell1 = row.getCell(1);
					String sPost = getCellValue(cell1)==null?"":getCellValue(cell1);
					if(sPost!=null&&!sPost.equals("")){
						data.put("sPost", sPost);
						//岗位序列
						HSSFCell  cell2 = row.getCell(2);
						String posCate = getCellValue(cell2)==null?"":getCellValue(cell2);
						data.put("posCate", posCate);
						//子序列
						HSSFCell  cell3 = row.getCell(3);
						String subCate = getCellValue(cell3)==null?"":getCellValue(cell3);
						data.put("subCate", subCate);
						//组织层级
						HSSFCell cell4 = row.getCell(4);
						String orgLevel = getCellValue(cell4)==null?"":getCellValue(cell4);
						data.put("orgLevel", orgLevel);
						//是否核心
						HSSFCell cell5 = row.getCell(5);
						String coreFlag = getCellValue(cell5)==null?"":getCellValue(cell5);
						data.put("coreFlag", coreFlag);
						//学历信息
						HSSFCell cell6 = row.getCell(6);
						String degree = getCellValue(cell6)==null?"":getCellValue(cell6);
						data.put("degree", degree);
						//开始时间
						HSSFCell  cell7 = row.getCell(7);
						String startTime = getCellValue(cell7)==null?"": getCellValue(cell7);
						data.put("startTime", startTime);
						//结束时间
						HSSFCell cell8 = row.getCell(8);
						String endTime = getCellValue(cell8)==null?"":getCellValue(cell8);
						data.put("endTime", endTime);
						data.put("orgId", orgId);//暂时写死
						list.add(data);
					}
				}
				 result=	posStandardposService.saveProvincePosts(list,currentUserId);
			}
			fis.close();//关闭输入流

		}
		else if(filePath.endsWith(XLSX)){
			//2007
			//创建XSSF
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			//获取总页数
			int sheetCount = workbook.getNumberOfSheets();
			for(int i=0;i<sheetCount;i++){
				List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
				//获取sheet页
				XSSFSheet sheets =  workbook.getSheetAt(i);
				//获取sheet使用行数
				int rowCount = sheets.getPhysicalNumberOfRows();
				//从第3行开始读取数据
				for(int j=1;j<rowCount;j++){
					XSSFRow row = sheets.getRow(j);
					Map<String , Object> data = new HashMap<String, Object>();
					//获取一行记录
					//集团基准岗位
					XSSFCell cell0= row.getCell(0);
					String jPost = getCellValue(cell0)==null?"":getCellValue(cell0);
					data.put("jPost", jPost);
					//省基准岗位
					XSSFCell cell1 = row.getCell(1);
					String sPost = getCellValue(cell1)==null?"":getCellValue(cell1);
					if(sPost!=null&&!sPost.equals("")){
						data.put("sPost", sPost);
						//岗位序列
						XSSFCell  cell2 = row.getCell(2);
						String posCate = getCellValue(cell2)==null?"":getCellValue(cell2);
						data.put("posCate", posCate);
						//子序列
						XSSFCell  cell3 = row.getCell(3);
						String subCate = getCellValue(cell3)==null?"":getCellValue(cell3);
						data.put("subCate", subCate);
						//组织层级
						XSSFCell cell4 = row.getCell(4);
						String orgLevel = getCellValue(cell4)==null?"":getCellValue(cell4);
						data.put("orgLevel", orgLevel);
						//是否核心
						XSSFCell cell5 = row.getCell(5);
						String coreFlag = getCellValue(cell5)==null?"":getCellValue(cell5);
						data.put("coreFlag", coreFlag);
						//学历信息
						XSSFCell cell6 = row.getCell(6);
						String degree = getCellValue(cell6)==null?"":getCellValue(cell6);
						data.put("degree", degree);
						//开始时间
						XSSFCell  cell7 = row.getCell(7);
						String startTime = getCellValue(cell7)==null?"": getCellValue(cell7);
						data.put("startTime", startTime);
						//结束时间
						XSSFCell cell8 = row.getCell(8);
						String endTime = getCellValue(cell8)==null?"":getCellValue(cell8);
						data.put("endTime", endTime);
						data.put("orgId", orgId);//暂时写死
						list.add(data);
					}
				}
				 result=	posStandardposService.saveProvincePosts(list,currentUserId);
			}
			fis.close();//关闭输入流
		}
			} catch (IOException e) {
				e.printStackTrace();
			}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	/**
	 *
	 * @Title: getCellValue
	 * @Description:读取指定单元格的值
	 * @author 张迟
	 * @param @param cell
	 * @param @return    设定文件
	 * @return String    返回类型
	 * @throws
	 */
	private  String getCellValue(Cell cell) {
		String result = null;
		if (cell != null) {
			switch (cell.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					result = String.valueOf(cell.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_ERROR:
					result = FormulaError.forInt(cell.getErrorCellValue())
							.getString();
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					result = String.valueOf(cell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_FORMULA:
					result = cell.getCellFormula();
					break;
				case Cell.CELL_TYPE_BLANK:
					result = "";
					break;
				default:
					result = cell.getStringCellValue().trim();
					break;
			}
		}
		return result;
	}

	@ApiOperation(value = " 终止", notes = " 终止", response = PosJposV.class,  produces = "application/octet-stream")
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
	 * 修改结束日期（终止）
	 */
	@PutMapping("/updateActiveEndDate")
	public ResponseEntity<Object> updateActiveEndDate(
			@RequestParam(
					value = "posId",
					required = false
			) String posId,
			@RequestParam(
					value = "activeEndDate",
					required = false
			) String activeEndDate


	) {

		long operatorId=3;//暂时写死

		Map<String, Object> params = new HashMap<String, Object>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置自己想要的时间格式
		Date parse = null;
		try {
			parse = sdf.parse(activeEndDate);
			params.put("activeEndDate", parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		params.put("posId", posId);

		boolean flag = false;
		try
		{
			flag = true;
			posStandardposService.updateActiveEndDate(params, operatorId);
		} catch (Exception e)
		{
			flag = false;
			e.printStackTrace();
		}
		HashMap<Object, Object> objectHashMap = new HashMap<>();
		objectHashMap.put(flag,"");
		return new ResponseEntity<>(objectHashMap, HttpStatus.OK);
	}
@ApiOperation(value = " 修改岗位职责", notes = " 修改岗位职责", response = PosJposV.class,  produces = "application/octet-stream")
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
	 * 修改岗位职责
	 */
	@PutMapping("/updatePosDutyInfo")
	public ResponseEntity<Object> updatePosDutyInfo(
			@RequestParam(
					value = "posId",
					required = false
			) String posId,
			@RequestParam(
					value = "_rate",
					required = false
			) String rate,
			@RequestParam(
					value = "ids",
					required = false
			) String ids


	) {

	long operatorId=3;//暂时写死
	if (ids.endsWith(","))
	{
		ids = ids.substring(0, ids.length() - 1);
	}
	String infos[] = ids.split(",");
	List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
	if (ids != null && !"".equals(ids))
	{
		for (int i = 0; i < infos.length; i++)
		{
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("skid", infos[i]);
			param.put("operatorId", operatorId);
			param.put("posId", posId);
			params.add(param);
		}
	}
	Map<String, Object> delparam = new HashMap<String, Object>();
	delparam.put("posId", posId);

	Map<String, Object> updateparam = new HashMap<String, Object>();
	updateparam.put("rate", rate);
	updateparam.put("posId", posId);

	boolean flag = false;
	try
	{
		flag = true;
		posPosElementService.updatePosDutyInfo(params, delparam, updateparam, operatorId);
	} catch (Exception e)
	{
		flag = false;
		e.printStackTrace();
	}

		return new ResponseEntity<>(flag, HttpStatus.OK);
	}

}

