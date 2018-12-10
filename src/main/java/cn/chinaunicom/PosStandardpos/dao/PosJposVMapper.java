package cn.chinaunicom.PosStandardpos.dao;

import cn.chinaunicom.PosStandardpos.entity.PosJposV;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * VIEW Mapper 接口
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-06
 */
public interface PosJposVMapper extends HrBaseMapper<PosJposV> {

    List<PosJposV> searchProvincePostList(Page<PosJposV> objectPage, HashMap<Object, Object> params);

    List<PosJposV> getPostListForExcel(Map<String, Object> params);

    List<PosJposV> searchGroupPostList(Page<PosJposV> objectPage, HashMap<Object, Object> params);

    Integer searchGroupPostListCount(HashMap<Object, Object> params);

    List<PosJposV> getPostListForExcell(Map<String, Object> params);

    List<PosJposV> getPostListForExcel2(Map<String, Object> params);
}
