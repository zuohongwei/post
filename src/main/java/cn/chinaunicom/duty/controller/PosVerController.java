package cn.chinaunicom.duty.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.duty.entity.PosElement;
import cn.chinaunicom.duty.entity.PosElementStructure;
import cn.chinaunicom.duty.entity.TemData;
import cn.chinaunicom.duty.service.PosElementService;
import cn.chinaunicom.duty.service.PosElementStructureService;
import cn.chinaunicom.duty.service.PosEmpElementService;
import cn.chinaunicom.duty.service.PosVerService;
import cn.chinaunicom.platform.utils.MessageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * ************************************** 描述: 职责维护
 * 
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController
 * @author lizhenhao
 * @since 2018-11-01
 * @version V1.0 **************************************
 */
@Api(
		value = "",
		tags = "")
@CrossOrigin(
		origins = "*",
		maxAge = 3600)
@RestController
@RequestMapping("/api/posVer")
public class PosVerController {

	@Autowired
	PosVerService				service;
	@Autowired
	PosElementService			posElementService;
	@Autowired
	PosElementStructureService	posElementStructureService;
	@Autowired
	PosEmpElementService		posEmpElementService;
	// @Autowired
	// DutyTreeService dutyTreeService;

	/**
	 * 
	 * 描述: （职责库维护页面初始化）
	 * 
	 * @param keyName
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(
			value = "职责库维护",
			notes = "职责库维护",
			response = PosElement.class,
			httpMethod = "GET")
	@ApiImplicitParams({ @ApiImplicitParam(
			name = "x-token-code",
			value = "用户登录令牌",
			paramType = "header",
			dataType = "String",
			required = true,
			defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4") })
	@ApiResponses({ @ApiResponse(
			code = 200,
			message = "获取数据成功",
			response = Page.class),
			@ApiResponse(
					code = 404,
					message = "未查询到数据") })
	@GetMapping("/list")
	public ResponseEntity<Object> getPosVerList(String keyName) {
		List<PosElement> elementList = new ArrayList<PosElement>();
		Map<String, Object> map = new HashMap<String, Object>();
		Integer versionId = service.getVersion().getVersionId();// 获取版本信息
		/**
		 * 不为空通过关键词查询
		 */
		if (StringUtils.isBlank(keyName))
		{
			elementList = posElementService.getElementList(versionId);
		} else
		{

		}
		map.put("versionId", versionId);
		map.put("list", elementList);

		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	/**
	 * 
	 * 描述: （根据当前节点展开下级节点）
	 * 
	 * @param keyName
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(
			value = "职责库下级节点",
			notes = "职责库下级节点",
			response = PosElement.class,
			httpMethod = "GET")
	@ApiImplicitParams({ @ApiImplicitParam(
			name = "x-token-code",
			value = "用户登录令牌",
			paramType = "header",
			dataType = "String",
			required = true,
			defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4") })
	@ApiResponses({ @ApiResponse(
			code = 200,
			message = "获取数据成功",
			response = Page.class),
			@ApiResponse(
					code = 404,
					message = "未查询到数据") })
	@GetMapping("/subList")
	public ResponseEntity<Object> getSubPosVerList(Integer versionId, Integer posCateId) {
		List<PosElement> subList = posElementService.getSubList(versionId, posCateId);
		return new ResponseEntity<>(subList, HttpStatus.OK);
	}

	/**
	 * 
	 * 描述: （新增岗位序列表）
	 * 
	 * @param keyName
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(
			value = "新增岗位序列表",
			notes = "新增岗位序列表",
			response = MessageResponse.class,
			httpMethod = "POST")
	@ApiImplicitParams({ @ApiImplicitParam(
			name = "x-token-code",
			value = "用户登录令牌",
			paramType = "header",
			dataType = "String",
			required = true,
			defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4") })
	@ApiResponses({ @ApiResponse(
			code = 200,
			message = "添加成功") })
	@PostMapping("/save")
	public ResponseEntity<Object> insertVerList(@RequestBody List<TemData> sortList, @RequestParam(
			value = "operatorId",
			required = false) String operatorId,
			@RequestParam(
					value = "type",
					required = false) String type,
			@RequestParam(
					value = "versionId",
					required = false) String versionId,
			@RequestParam(
					value = "state",
					required = false) String state) {

		MessageResponse vo = new MessageResponse();
		List<PosElement> list = new ArrayList<PosElement>();
		List<PosElementStructure> structure = new ArrayList<PosElementStructure>();
		Map<String, Object> result = new HashMap<String, Object>();

		if (sortList != null && sortList.size() > 0)
		{
			for (int i = 0; i < sortList.size(); i++)
			{
				if (StringUtils.isBlank(sortList.get(i).getElementId()))
				{
					result = getResult(sortList.get(i), operatorId, versionId, type, new Random().nextInt(999999), true);
					list.add((PosElement) result.get("element"));
					structure.add((PosElementStructure) result.get("structure"));
				} else
				{
					result = getResult(sortList.get(i), operatorId, versionId, type, Integer.parseInt(sortList.get(i).getElementId()), false);
				}

			}

		}

		boolean pos = posElementService.insertBatch(list);
		boolean structs = posElementStructureService.insertBatch(structure);
		if (pos && structs)
		{
			vo.setMsg("添加成功");
		} else
		{
			vo.setMsg("添加失败");
		}
		return new ResponseEntity<>(vo, HttpStatus.OK);

	}

	/**
	 * 
	 * 描述: （删除岗位序列表）
	 * 
	 * @param keyName
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(
			value = "删除岗位序列表",
			notes = "删除岗位序列表",
			response = MessageResponse.class,
			httpMethod = "GET")
	@ApiImplicitParams({ @ApiImplicitParam(
			name = "x-token-code",
			value = "用户登录令牌",
			paramType = "header",
			dataType = "String",
			required = true,
			defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4") })
	@ApiResponses({ @ApiResponse(
			code = 200,
			message = "获取数据成功",
			response = Page.class),
			@ApiResponse(
					code = 404,
					message = "未查询到数据") })
	@GetMapping("/delete")
	public ResponseEntity<Object> deleteVerList(@RequestBody Map<String, Object> reqMap) {
		boolean isTrue = posElementStructureService.deleteByMap(reqMap);
		return new ResponseEntity<>(isTrue, HttpStatus.OK);
	}

	/**
	 * 
	 * 描述: （是否分配至员工）
	 * 
	 * @param keyName
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(
			value = "是否分配至员工",
			notes = "是否分配至员工",
			response = MessageResponse.class,
			httpMethod = "GET")
	@ApiImplicitParams({ @ApiImplicitParam(
			name = "x-token-code",
			value = "用户登录令牌",
			paramType = "header",
			dataType = "String",
			required = true,
			defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4") })
	@ApiResponses({ @ApiResponse(
			code = 200,
			message = "获取数据成功",
			response = Page.class),
			@ApiResponse(
					code = 404,
					message = "未查询到数据") })
	@GetMapping("/isDispath")
	public ResponseEntity<Object> isDistribution(@RequestParam(
			value = "elementId",
			required = false) String elementId,
			@RequestParam(
					value = "operatorId",
					required = false) String operatorId) {

		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	// @ApiOperation(
	// value = "职责范围树形结构",
	// notes = "职责范围树形结构",
	// response = DutyTree.class,
	// httpMethod = "GET")
	// @ApiImplicitParams({ @ApiImplicitParam(
	// name = "x-token-code",
	// value = "用户登录令牌",
	// paramType = "header",
	// dataType = "String",
	// required = true,
	// defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4") })
	// @ApiResponses({ @ApiResponse(
	// code = 200,
	// message = "获取数据成功",
	// response = Page.class),
	// @ApiResponse(
	// code = 404,
	// message = "未查询到数据") })
	// @GetMapping("/tree")
	// public ResponseEntity<Object> getDutyTree() {
	//
	// return new ResponseEntity<>(null, HttpStatus.OK);
	// }

	/**
	 * 
	 * 描述: （获取列表保存更新结果）
	 * 
	 * @return Map<String,Object>
	 */
	private Map<String, Object> getResult(TemData data, String operatorId, String versionId, String type, int sequence, Boolean isSave) {
		Map<String, Object> map = new HashMap<String, Object>();
		PosElement element = new PosElement();
		PosElementStructure struElement = new PosElementStructure();
		element.setElementId(sequence);
		element.setElementCode(data.getElementCode());
		element.setElementName(data.getElementName());
		element.setElementType(type);
		if (isSave)
		{
			element.setCreatedBy(Integer.parseInt(operatorId));// 更新不需要
		}
		if (isSave)
		{
			element.setCreationDate(new Date());// 更新不需要
		}
		element.setLastUpdatedBy(Integer.parseInt(operatorId));
		element.setLastUpdateDate(new Date());
		struElement.setVersionId(Integer.parseInt(versionId));
		struElement.setElementIdParent(Integer.parseInt(data.getParentId()));
		struElement.setElementIdChild(sequence);
		struElement.setCreatedBy(Integer.parseInt(operatorId));
		struElement.setCreationDate(new Date());
		struElement.setLastUpdatedBy(Integer.parseInt(operatorId));
		struElement.setLastUpdateDate(new Date());
		map.put("element", element);
		map.put("structure", struElement);
		return map;

	}

}
