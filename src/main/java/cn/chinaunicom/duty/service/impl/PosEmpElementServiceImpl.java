package cn.chinaunicom.duty.service.impl;

import cn.chinaunicom.duty.entity.PosEmpElement;
import cn.chinaunicom.duty.dao.PosEmpElementMapper;
import cn.chinaunicom.duty.service.PosEmpElementService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-08
 */
@Service
public class PosEmpElementServiceImpl extends HrServiceImpl<PosEmpElementMapper, PosEmpElement> implements PosEmpElementService {

	@Autowired
	PosEmpElementMapper mapper;
	
	@Override
	public List<PosEmpElement> getPosEmpElementList() {
		return mapper.selectList(new EntityWrapper<PosEmpElement>().eq("1", "1"));
	}

	@Override
	public Integer savePosEmpElement(PosEmpElement entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updatePosEmpElement(PosEmpElement entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deletePosEmpElement(Long id) {
		return mapper.deleteById(id);
	}
}
