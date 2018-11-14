package cn.chinaunicom.PosStandardpos.service.impl;

import cn.chinaunicom.PosStandardpos.dao.PosJposVMapper;
import cn.chinaunicom.PosStandardpos.entity.PosJposV;
import cn.chinaunicom.PosStandardpos.service.PosJposVService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-06
 */
@Service
public class PosJposVServiceImpl extends HrServiceImpl<PosJposVMapper, PosJposV> implements PosJposVService {

	@Resource
	PosJposVMapper mapper;
	
	@Override
	public List<PosJposV> getPosJposVList() {
		return mapper.selectList(new EntityWrapper<PosJposV>().eq("1", "1"));
	}

	@Override
	public Integer savePosJposV(PosJposV entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updatePosJposV(PosJposV entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deletePosJposV(Long id) {
		return mapper.deleteById(id);
	}

	@Override
	public List<PosJposV> searchProvincePostList(Page<PosJposV> objectPage, HashMap<Object, Object> params) {
		return mapper.searchProvincePostList(objectPage,params);
	}

	@Override
	public List<PosJposV> getPostListForExcel(Map<String, Object> params) {
		return mapper.getPostListForExcel(params);
	}

	@Override
	public List<PosJposV> searchGroupPostList(Page<PosJposV> objectPage, HashMap<Object, Object> params) {
		Integer flag = (Integer) params.get("posFlag");
		List<PosJposV> posResult=new ArrayList<>();
		if(flag!=null){
			// posResult= mapper.searchGroupPostList();
		}else{
			posResult= mapper.searchGroupPostList(objectPage,params);


		}



		return posResult;
	}

	@Override
	public Integer searchGroupPostListCount(HashMap<Object, Object> params) {
		return mapper.searchGroupPostListCount(params);
	}

	@Override
	public List<PosJposV> getPostListForExcel2(Map<String, Object> params) {
		Object object = params.get("posFlag");
		List<PosJposV> posList = null;
		if(object==null){

		}else{
			posList = mapper.getPostListForExcel2(params);
		}
		return posList;

	}
}
