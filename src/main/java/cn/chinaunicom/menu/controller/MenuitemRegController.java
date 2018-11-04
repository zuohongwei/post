package cn.chinaunicom.menu.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.menu.entity.MenuList;
import cn.chinaunicom.menu.entity.MenuitemReg;
import cn.chinaunicom.menu.service.MenuitemRegService;
import cn.chinaunicom.platform.utils.MessageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.web.bind.annotation.RestController;

/**
 * **************************************
 * 描述: 菜单注册
 * @ClassName: cn.chinaunicom.func.controller.FuncRegisterController 
 * @author zuohongwei 
 * @since 2018-09-19
 * @version V1.0
 * **************************************
 */
@Api(value = "菜单注册", tags = "菜单注册")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/menuitemReg")
public class MenuitemRegController {

	@Autowired
	MenuitemRegService service;
	
	@ApiOperation(value = "菜单注册列表", notes = "菜单注册列表", response = MenuitemReg.class, httpMethod = "GET")
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
    public ResponseEntity<Object> getMenuitemRegList(){
		List<MenuitemReg> list = service.getMenuitemRegList();
        if(list==null) {
            list = new ArrayList<MenuitemReg>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
	
	@ApiOperation(value = "保存菜单注册", notes = "保存菜单注册", response = MessageResponse.class, httpMethod = "POST")
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
	public ResponseEntity<Object> saveMenuitemReg(MenuitemReg entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.saveMenuitemReg(entity);
        if(i>0) {
        	vo.setMsg("添加成功");
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
	
	@ApiOperation(value = "菜单列表", notes = "菜单列表", response = MenuList.class, httpMethod = "GET")
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
    @GetMapping("/menulist")
    public ResponseEntity<Object> getMenuList(){
		List<MenuList> list = service.getMenuList();
        if(list==null) {
            list = new ArrayList<MenuList>();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

