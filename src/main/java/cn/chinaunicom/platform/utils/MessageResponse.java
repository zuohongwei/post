package cn.chinaunicom.platform.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * **************************************
 * 描述: 接口返回信息实体类 
 * @ClassName: cn.chinaunicom.utils.MessageResponse 
 * @author zuohongwei 
 * @version V1.0
***************************************
 */
@ApiModel(value = "MessageResponse", description = "接口响应实体")
public class MessageResponse {

    @ApiModelProperty(value = "接口返回信息")
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

