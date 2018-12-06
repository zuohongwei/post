package cn.chinaunicom.Instructionsmatain.controller;


import cn.chinaunicom.common.FastJsonUtils;
import cn.chinaunicom.duty.entity.OrganizationAll;
import cn.chinaunicom.duty.entity.PosElement;
import cn.chinaunicom.duty.entity.PosPosdes;
import cn.chinaunicom.duty.service.AuthCtrlValueService;
import cn.chinaunicom.duty.service.OrganizationAllService;
import cn.chinaunicom.duty.service.PosElementService;
import cn.chinaunicom.duty.service.PosPosdesService;
import com.baomidou.mybatisplus.plugins.Page;
import io.swagger.annotations.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * **************************************
 * 描述: 岗位说明书
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author lizhenhao 
 * @since 2018-11-28
 * @version V1.0
 * **************************************
 */
@Api(value = "岗位说明书", tags = "岗位说明书")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/posPosdes")
public class PosPosdesController {

	@Autowired
	PosPosdesService service;
	@Autowired
	PosElementService posElementService;
    @Autowired
    AuthCtrlValueService authCtrlValueService;
    @Autowired
    OrganizationAllService organizationAllService;
    @Autowired
    PosPosdesService posPosdesService;


	@ApiOperation(value = "岗位说明书列表", notes = "岗位说明书列表", response = PosPosdes.class, httpMethod = "GET")
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
    public ResponseEntity<Object> getPosPosDesList(@RequestParam(value = "login_name", required = true) String login_name,
                                                   @RequestParam(value = "resp_id",required = true) String resp_id,
                                                   @RequestParam(value = "personOrgId",required = false) String personOrgId,
                                                   @RequestParam(value = "personOrgName",required = false) String personOrgName,
                                                   @RequestParam(value = "posCateId",required = false) String posCateId,
                                                   @RequestParam(value = "posLevel",required = false) String posLevel,
                                                   @RequestParam(value = "keyrespId",required = false) String keyrespId,
                                                   @RequestParam(value = "keyrespName",required = false) String keyrespName,
                                                   @RequestParam(value = "searchDate",required = false) String searchDate,
                                                   @RequestParam(value = "posName",required = false) String posName,
                                                   @RequestParam(value = "rangeId",required = true) String rangeId,
                                                   @RequestParam(value = "currentPageNum",required = true) int currentPageNum,
                                                   @RequestParam(value = "recordNum",required = true) int recordNum
                                                   ){

        Map<String,Object> map = new HashMap<>();
        Map<String,Object> paramterMap = new HashMap<>();
        Map<String, Object> result = new HashMap<>();
        List<PosElement> list = new ArrayList<>();
		List<Map<String,Object>> listPlus =new ArrayList<>();
        List<String> allIds = new ArrayList<>();
        list = posElementService.getDutyList();//关键职责列表
        String jsonValue = authCtrlValueService.getTopId(login_name, resp_id);

        String topId = (String) FastJsonUtils.stringToCollect(jsonValue).get("orgIds");// 获取顶层组织id
        result= organizationAllService.getTop(topId);//获取顶层组织信息

        List<OrganizationAll> subTree = organizationAllService.getSub(topId);//获取下层组织信息
        result.put("children",subTree);
        listPlus.add(result);
        map.put("tree",listPlus);
        map.put("duty",list);



        paramterMap = getQueryMap(personOrgId, personOrgName, posCateId, posLevel, keyrespId, keyrespName, searchDate, posName,rangeId);//封装岗位说明书查询列表请求参数
        if(StringUtils.isNotBlank(personOrgId)){
            allIds = organizationAllService.getAllIds(topId);//获取当前组织下所有组织id包括自己
            paramterMap.put("ids",allIds);
        }

        Page<PosPosdes> page = new Page<>(currentPageNum, recordNum);
        List<Map<String, Object>>  param = posPosdesService.getList(page, paramterMap);//查询岗位说明书列表
        map.put("dutyList",param);

        Integer count = posPosdesService.getCount(paramterMap);
        map.put("count",count);


        return new ResponseEntity<>(map, HttpStatus.OK);
    }



    @ApiOperation(value = "获取下级组织信心", notes = "获取下级组织信心", response = PosPosdes.class, httpMethod = "GET")
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
    @GetMapping("/sub")
    public ResponseEntity<Object> getSubList(String topId){

        List<OrganizationAll> subTree = organizationAllService.getSub(topId);
        return new ResponseEntity<>(subTree, HttpStatus.OK);
    }




    @ApiOperation(value = "关键职责", notes = "关键职责", response = PosPosdes.class, httpMethod = "GET")
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
    @GetMapping("/posKey")
    public ResponseEntity<Object> getPosKeyElement(@RequestParam(value = "elementName", required = false) String elementName,
                                                   @RequestParam(value = "flexValueId", required = false) String flexValueId,
                                                   @RequestParam(value = "searchDate", required = false) String searchDate,
                                                   @RequestParam(value = "professionId", required = false) String professionId,
                                                   @RequestParam(value = "currentPageNum",required = true) int currentPageNum,
                                                   @RequestParam(value = "recordNum",required = true) int recordNum
                                                   ){

        Map<String,Object> map = new HashMap<>();
        Map<String,Object> result = new HashMap<>();
        Page<PosPosdes> page = new Page<>(currentPageNum, recordNum);
        if(StringUtils.isNotBlank(elementName)){
            map.put("elementName",elementName);
        }
        if(StringUtils.isNotBlank(flexValueId)){
            map.put("flexValueId",flexValueId);
        }
        if(StringUtils.isNotBlank(searchDate)){
            map.put("searchDate",searchDate);
        }
        if(StringUtils.isNotBlank(professionId)){
            map.put("professionId",professionId);
        }


        List<Map<String, Object>> list = posPosdesService.selectPosKeyElement(page, map);
        result.put("posKeyList",list);
        Integer count = posPosdesService.selectPosKeyElementCount(map);
        result.put("count",count);
        List<Map<String, Object>> listPlus = posPosdesService.selectProfessionList();
        result.put("professionList",listPlus);


        return new ResponseEntity<>(result, HttpStatus.OK);
    }









    private Map<String,Object> getQueryMap (String personOrgId,String personOrgName,String posCateId,String posLevel,String keyrespId,String keyrespName,String searchDate,String posName,String rangeId){
        Map<String,Object> map = new HashMap<>();
	    if(StringUtils.isNotBlank(personOrgId)){
            map.put("personOrgId",personOrgId);
        }

        if(StringUtils.isNotBlank(personOrgName)){
            map.put("personOrgName",personOrgName);
        }

        if(StringUtils.isNotBlank(posCateId)){
            map.put("posCateId",posCateId);
        }

        if(StringUtils.isNotBlank(posLevel)){
            map.put("posLevel",posLevel);
        }

        if(StringUtils.isNotBlank(keyrespId)){
            map.put("keyrespId",keyrespId);
        }

        if(StringUtils.isNotBlank(keyrespName)){
            map.put("keyrespName",keyrespName);
        }

        if(StringUtils.isNotBlank(searchDate)){
            map.put("searchDate",searchDate);
        }

        if(StringUtils.isNotBlank(posName)){
            map.put("posName",posName);
        }

        if(StringUtils.isNotBlank(rangeId)){
            map.put("rangeId",rangeId);
        }

	    return map;
    }






}

