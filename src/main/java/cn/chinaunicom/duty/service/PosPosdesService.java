package cn.chinaunicom.duty.service;

import cn.chinaunicom.duty.entity.PosPosdes;
import cn.chinaunicom.platform.service.IHrService;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 岗位说明书 服务类
 * </p>
 *
 * @author lizhenhao
 * @since 2018-11-28
 */
public interface PosPosdesService extends IHrService<PosPosdes> {
    List<Map<String,Object>> getList(Page<PosPosdes>page,Map<String, Object> map);

    Integer getCount(Map<String,Object>map);

    List<Map<String,Object>>selectPosKeyElement(Page<PosPosdes> page,Map<String,Object>map);

    List<Map<String,Object>> selectProfessionList();
    Integer  selectPosKeyElementCount(Map<String,Object>map);

	
}
