package cn.chinaunicom.duty.service;

import cn.chinaunicom.duty.entity.PosEmpElement;
import cn.chinaunicom.platform.service.IHrService;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-08
 */
public interface PosEmpElementService extends IHrService<PosEmpElement> {

	public List<PosEmpElement> getPosEmpElementList();
	
	public Integer savePosEmpElement(PosEmpElement entity);
	
	public Integer updatePosEmpElement(PosEmpElement entity);
	
	public Integer deletePosEmpElement(Long id);
	
}
