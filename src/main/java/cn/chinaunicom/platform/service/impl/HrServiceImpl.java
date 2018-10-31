package cn.chinaunicom.platform.service.impl;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import cn.chinaunicom.platform.service.IHrService;

/**
 * **************************************
 * 描述:项目Service实现基类 
 * @ClassName: cn.chinaunicom.service.impl.HrServiceImpl 
 * @author zuohongwei 
 * @version V1.0
***************************************
 */
public class HrServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements IHrService<T> {

}
