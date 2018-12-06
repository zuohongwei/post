package cn.chinaunicom.duty.controller;

import java.util.*;

import cn.chinaunicom.duty.entity.*;
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
@Api(value = "", tags = "")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/posVer")
public class PosVerController {

	@Autowired
	PosVerService service;
	@Autowired
	PosElementService posElementService;
	@Autowired
	PosElementStructureService posElementStructureService;
	@Autowired
	PosEmpElementService posEmpElementService;


	@ApiOperation(value = "获取当前版本信息", notes = "获取当前版本信息", response = PosElement.class, httpMethod = "GET")
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
	@GetMapping("/ver")
	public ResponseEntity<Object> getVerList() {
		Map<String, Object> map = new HashMap<String, Object>();
		PosVer version = service.getVersion();
		List<PosVer> list = service.getVersionList();
		map.put("ver", version);
		map.put("verList", list);
		return new ResponseEntity<>(map, HttpStatus.OK);
	}


	@ApiOperation(value = "根据关键词查询列表", notes = "根据关键词查询列表", response = PosElementStructure.class, httpMethod = "GET")
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
	@GetMapping("/key")
	public ResponseEntity<Object> getListByKeyName(String elementName, String versionId) {
		List<PosElementStructure> info = new ArrayList<>();
		List<PosElementStructure> listPlus = new ArrayList<>();
		List<PosElementStructure> Ids = new ArrayList<>();
		PosElementStructure structure = new PosElementStructure();


		Map<String,Object>map =new HashMap<>();

		List<String> ids = posElementService.getIds(elementName);
		
		if (ids.size() > 0) {
			for (String id : ids) {
				info = posElementStructureService.getParentInfo(id, versionId);
				listPlus.addAll(info);
			}
			listPlus= removeDuplicateCase(listPlus);
			listPlus = sort(listPlus);
		}
		//拼装层级
		for (PosElementStructure plus : listPlus) {
			PosElementStructure str = new PosElementStructure();
			List<PosElementStructure> subIds = new ArrayList<>();
			if(plus.getElementType().equals("10")){
				str.setPosCateId(plus.getPosCateId());
				str.setPosCateName(plus.getPosCateName());
				str.setParentId(plus.getParentId());
				for(PosElementStructure plus1 : listPlus){
					if(plus.getPosCateId().equals(plus1.getParentId())){
						subIds.add(plus1);
					}
				}
					str.setChildren(subIds);
			}
				if(StringUtils.isNotBlank(str.getPosCateId())){
					Ids.add(str);
				}
		}
		map.put("tree",Ids);

		for(Iterator<PosElementStructure> iterator = listPlus.iterator() ; iterator.hasNext() ; )
		{
			structure = iterator.next();
			if (!structure.getElementType().equals("10")){
				iterator.remove();
			}
		}

		map.put("infoList",listPlus);

		return new ResponseEntity<>(map, HttpStatus.OK);
	}


	/**
	 * 描述: （职责库维护页面初始化）
	 *
	 * @param
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(value = "职责库维护树", notes = "职责库维护树", response = PosElement.class, httpMethod = "GET")
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
	public ResponseEntity<Object> getPosVerList(String versionId,String posCateId,String elementType) {
		int type = Integer.parseInt(elementType);
		switch(type){
			case 10:
				type=type+10;
				break;
			case 20:
				type=type+10;
				break;
			case 30:
				type=type+10;
				break;
			case 40:
				type=type+10;
				break;
			default:
				type=10;
		}
		List<PosElement> list = posElementService.getElementList(versionId, String.valueOf(type), posCateId);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}


	/**
	 * 描述: （新增岗位序列表）
	 *
	 * @param
	 * @return ResponseEntity<Object>
	 */


	@ApiOperation(value = "新增岗位序列表", notes = "新增岗位序列表", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({@ApiResponse(
			code = 200,
			message = "添加成功")})
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
		List<PosElement> saveList = new ArrayList<PosElement>();
		List<PosElementStructure> saveStructure = new ArrayList<PosElementStructure>();
		List<PosElement> updateList = new ArrayList<PosElement>();
		List<PosElementStructure> updateStructure = new ArrayList<PosElementStructure>();
		Map<String, Object> result = new HashMap<String, Object>();

		if (sortList != null && sortList.size() > 0) {
			for (int i = 0; i < sortList.size(); i++) {
				if (StringUtils.isBlank(sortList.get(i).getElementId())) {
					result = getResult(sortList.get(i), operatorId, versionId, type, new Random().nextInt(999999));
					saveList.add((PosElement) result.get("element"));
					saveStructure.add((PosElementStructure) result.get("structure"));

				} else {
					result = getResult(sortList.get(i), operatorId, versionId, type, Integer.parseInt(sortList.get(i).getElementId()));
					updateList.add((PosElement) result.get("element"));
					updateStructure.add((PosElementStructure) result.get("structure"));

				}

			}
		}

		//插入要素
		if(saveList.size()>0){
			boolean pos = posElementService.insertBatch(saveList);
		}

		//插入关系
		if(saveStructure.size()>0){
			int isSuccess = posElementStructureService.createElementStructureInfo(saveStructure);
		}

		//修改要素
		if(updateList.size()>0){
			Integer count = posElementService.updateElementInfo(updateList);
		}




		return new ResponseEntity<>(null, HttpStatus.OK);

	}

	/**
	 * 描述: （删除岗位序列表）
	 *
	 * @param
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(value = "删除岗位序列表", notes = "删除岗位序列表", response = PosElement.class, httpMethod = "GET")
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
	@GetMapping("/delete")
	public ResponseEntity<Object> deleteVerList(@RequestBody Map<String, Object> reqMap) {
		boolean isTrue = posElementStructureService.deleteByMap(reqMap);
		return new ResponseEntity<>(isTrue, HttpStatus.OK);
	}

	/**
	 * 描述: （是否分配至员工）
	 *
	 * @param
	 * @return ResponseEntity<Object>
	 */
	@ApiOperation(value = "是否分配至员工", notes = "是否分配至员工", response = PosElement.class, httpMethod = "GET")
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
	@GetMapping("/isDispath")
	public ResponseEntity<Object> isDistribution(@RequestParam(
			value = "elementId",
			required = false) String elementId,
												 @RequestParam(
														 value = "operatorId",
														 required = false) String operatorId) {

		return new ResponseEntity<>(null, HttpStatus.OK);
	}


	/**
	 * 描述: （获取列表保存更新结果）
	 *
	 * @return Map<String , Object>
	 */
	private Map<String, Object> getResult(TemData data, String operatorId, String versionId, String type, int sequence) {
		Map<String, Object> map = new HashMap<>();
		PosElement element = new PosElement();
		PosElementStructure struElement = new PosElementStructure();
		element.setElementId(sequence);
		element.setElementCode(data.getElementCode());
		element.setElementName(data.getElementName());
		element.setElementType(type);
		element.setCreatedBy(Integer.parseInt(operatorId));
		element.setCreationDate(new Date());
		element.setLastUpdatedBy(Integer.parseInt(operatorId));
		element.setLastUpdateDate(new Date());
		element.setParentId(data.getParentId());
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




	/**
	 * list去重
	 * @param cases
	 * @return
	 */
	private List<PosElementStructure> removeDuplicateCase(List<PosElementStructure> cases) {
		Set<PosElementStructure> set = new TreeSet<>(new Comparator<PosElementStructure>() {
			@Override
			public int compare(PosElementStructure o1, PosElementStructure o2) {
				return o1.getPosCateId().compareTo(o2.getPosCateId());
			}
		});
		set.addAll(cases);
		return new ArrayList<>(set);
	}


	/**
	 * 根据elementCode排序
	 * @param list
	 * @return
	 */
	public List<PosElementStructure>sort(List<PosElementStructure>list){
		Collections.sort(list, new Comparator<PosElementStructure>() {
			@Override
			public int compare(PosElementStructure  o1, PosElementStructure  o2) {
				//升序
				return o1.getElementCode()-o2.getElementCode();
			}
		});
		return list;
	}

}
