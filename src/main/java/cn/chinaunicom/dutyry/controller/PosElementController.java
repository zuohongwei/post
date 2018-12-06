package cn.chinaunicom.dutyry.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.common.FileUtil;
import cn.chinaunicom.duty.entity.PosElement;
import cn.chinaunicom.duty.entity.PosElementEmp;
import cn.chinaunicom.duty.service.PosElementService;
import cn.chinaunicom.platform.utils.MessageResponse;
import cn.chinaunicom.resplist.entity.MenuItemTree;
import cn.chinaunicom.resplist.service.EhrcucPosElementStructureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RestController;

/**
 * **************************************
 * 描述: 
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author lizhenhao 
 * @since 2018-11-13
 * @version V1.0
 * **************************************
 */
@Api(value = "", tags = "")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/posElement")
public class PosElementController {
	
	private static final String FILENAME="关键职责职级列表";
	private static final String FILENAME_PLUS="关键职责库信息";
	private static final String SHEET_NAME="关键职责库";
	private static final String EXPORT_ISSUCCESS="导出成功";
	private static final String EXPORT_NOSUCCESS="导出失败";

	@Autowired
	PosElementService			posElementService;
	@Autowired
	EhrcucPosElementStructureService service;
	
	@ApiOperation(value = "关键职责库查询列表", notes = "关键职责库查询列表", response = PosElement.class, httpMethod = "GET")
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
    public ResponseEntity<Object> getPosElementList(@RequestParam(value = "flag",required = false) String flag,
													@RequestParam(
															value = "sequence",
															required = false) String sequence,
													@RequestParam(
															value = "sequenceName",
															required = false) String sequenceName,
													@RequestParam(
															value = "respName",
															required = false) String respName,
													@RequestParam(
															value = "status",
															required = false) String status,
													@RequestParam(
															value = "cRespName",
															required = false) String cRespName,
													@RequestParam(
															value = "levelType",
															required = false) String[] levelType,
													@RequestParam(
															value = "currentPageNum") int currentPageNum,
													@RequestParam(
															value = "recordNum") int recordNum,
													HttpServletResponse response){
		
		
		List<PosElement> listPlus = new ArrayList<PosElement>();
		Map<String,Object> map = new HashMap<String,Object>();
		Page<PosElement> objectPage = new Page<>(currentPageNum, recordNum);

		Map<String, Object> params = getQueryMap(sequence, sequenceName, respName, status, cRespName, levelType);
		listPlus = posElementService.getPosElementPagList(objectPage, params);
		Integer count = posElementService.getPosElementPagListCount(params);
		if (listPlus == null)
		{
			listPlus = new ArrayList<PosElement>();
		}
		map.put("list", listPlus);
		map.put("count", count);
		map.put("currentPageNum", currentPageNum);
		map.put("recordNum", recordNum);
		return new ResponseEntity<>(map, HttpStatus.OK);
	
    }
	
	
	
	
	
	
	@ApiOperation(value = "关键职责库导出excel", notes = "关键职责库导出excel", response = PosElement.class, httpMethod = "GET")
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
    @GetMapping("/export")
    public ResponseEntity<Object> exportExcel(@RequestParam(value = "flag",required = false) String flag,
													@RequestParam(
															value = "sequence",
															required = false) String sequence,
													@RequestParam(
															value = "sequenceName",
															required = false) String sequenceName,
													@RequestParam(
															value = "respName",
															required = false) String respName,
													@RequestParam(
															value = "status",
															required = false) String status,
													@RequestParam(
															value = "cRespName",
															required = false) String cRespName,
													@RequestParam(
															value = "levelType",
															required = false) String[] levelType,
													HttpServletResponse response){
		
			MessageResponse vo = new MessageResponse();
			List<PosElementEmp> list = new ArrayList<PosElementEmp>();
			Map<String, Object> params = getQueryMap(sequence, sequenceName, respName, status, cRespName, levelType);
			list=posElementService.getPosElementPagList(params);
			if(flag!=null&&"L".equals(flag)){
				try
				{
					FileUtil.exportExcel(list, null, PosElementController.SHEET_NAME, PosElementEmp.class, PosElementController.FILENAME, response);
					vo.setMsg(PosElementController.EXPORT_ISSUCCESS);
				} catch (Exception e)
				{
					vo.setMsg(PosElementController.EXPORT_NOSUCCESS);
				}
				
			}else {
				try
				{
					FileUtil.exportExcel(list, null, PosElementController.SHEET_NAME, PosElementEmp.class, PosElementController.FILENAME_PLUS, response);
					vo.setMsg(PosElementController.EXPORT_ISSUCCESS);
				} catch (Exception e)
				{
					vo.setMsg(PosElementController.EXPORT_NOSUCCESS);
				}
				
			}
		
			return new ResponseEntity<>(vo, HttpStatus.OK);
	
    }
	
	
	
	@ApiOperation(value = "职责树全量数据", notes = "职责树全量数据", response = PosElement.class, httpMethod = "GET")
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
	@GetMapping("/tree")
    public ResponseEntity<Object> getPosElementTree(){
		List<MenuItemTree> list = service.queryRespRange();
		if(list==null) {
			list=new ArrayList<MenuItemTree>();
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	
    }
	
	
	
	
	
	
	/**
	 * 
	*描述: （拼接请求参数） 
	*@param sequence
	*@param sequenceName
	*@param respName
	*@param status
	*@param cRespName
	*@param levelType
	*@return Map<String,Object>
	 */
	private Map<String,Object>  getQueryMap(String sequence,String sequenceName,String respName,String status,String cRespName,String[] levelType) {
		status = "1";
		HashMap<String, Object> params = new HashMap<>();
		if (StringUtils.isNotBlank(respName))
		{
			params.put("respName", respName);
		}

		if (StringUtils.isNotBlank(cRespName))
		{
			params.put("cRespName", cRespName);
		}

		if (StringUtils.isNotBlank(sequenceName))
		{
			if (sequenceName.endsWith(","))
			{
				sequenceName = sequenceName.substring(0, sequenceName.length() - 1);
			}
			params.put("sequenceName", sequenceName);
		}
		params.put("sequence", sequence);// 职责范围字段,element_id拼接出来
		params.put("status", status);
		params.put("levelType", levelType);
		return params;
		
	}
   
}

