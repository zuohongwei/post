package cn.chinaunicom.posstandardpos.service.impl;

import cn.chinaunicom.posstandardpos.entity.PosPosElement;
import cn.chinaunicom.posstandardpos.dao.PosPosElementMapper;
import cn.chinaunicom.posstandardpos.service.PosPosElementService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 * 基准岗位和要素关系 服务实现类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-19
 */
@Service
public class PosPosElementServiceImpl extends HrServiceImpl<PosPosElementMapper, PosPosElement> implements PosPosElementService {

	@Autowired
	PosPosElementMapper mapper;
	
	@Override
	public List<PosPosElement> getPosPosElementList() {
		return mapper.selectList(new EntityWrapper<PosPosElement>().eq("1", "1"));
	}

	@Override
	public Integer savePosPosElement(PosPosElement entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updatePosPosElement(PosPosElement entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deletePosPosElement(Long id) {
		return mapper.deleteById(id);
	}

	@Override
	public List<PosPosElement> getElementById(Map<String, Object> params) {
		return mapper.getElementById(params);
	}

	@Override
	public List<PosPosElement> selectElebyPosId(String posId) {
		return mapper.selectElebyPosId(posId);
	}

	@Override
	public void updatePosDutyInfo(List<Map<String, Object>> params, Map<String, Object> delparam, Map<String, Object> updateparam, long operatorId) {
		mapper.deletePosDutyInfo(delparam);

		mapper.createPosDutyInfoNew(params);

		mapper.updatePosRate(updateparam);
	}
}
