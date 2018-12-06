package cn.chinaunicom.PosStandardpos.service;

import cn.chinaunicom.PosStandardpos.entity.PosJposV;
import cn.chinaunicom.platform.service.IHrService;
import cn.chinaunicom.PosStandardpos.entity.posiVo;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-06
 */
public interface PosJposVService extends IHrService<PosJposV> {

	public List<PosJposV> getPosJposVList();
	
	public Integer savePosJposV(PosJposV entity);
	
	public Integer updatePosJposV(PosJposV entity);
	
	public Integer deletePosJposV(Long id);

    List<PosJposV> searchProvincePostList(Page<PosJposV> objectPage, HashMap<Object, Object> params);

    List<PosJposV> getPostListForExcel(Map<String, Object> params);

	List<PosJposV> searchGroupPostList(Page<PosJposV> objectPage, HashMap<Object, Object> params);

	Integer searchGroupPostListCount(HashMap<Object, Object> params);

	List<PosJposV> getPostListForExcell(Map<String, Object> params);

	List<posiVo> selectElebyPosId(String posId);
}
