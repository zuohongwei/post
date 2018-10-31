package cn.chinaunicom.platform.service;

import com.baomidou.mybatisplus.service.IService;

/**
 * **************************************
 * 描述:项目Service接口基类 
 * @ClassName: cn.chinaunicom.service.IHrService 
 * @author zuohongwei 
 * @version V1.0
***************************************
 */
public interface IHrService<T> extends IService<T>{

	/**
     * 获取页数
     *
     * @param pageNumber
     * @param pageSize
     * @return
     */
    default Integer getPageNumber(Integer pageNumber, Integer pageSize) {

        return (pageNumber - 1) * pageSize;
    }
}
