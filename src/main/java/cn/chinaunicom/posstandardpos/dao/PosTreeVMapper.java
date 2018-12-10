package cn.chinaunicom.posstandardpos.dao;

import cn.chinaunicom.posstandardpos.entity.PosTreeV;
import cn.chinaunicom.posstandardpos.entity.posiVo;
import cn.chinaunicom.platform.dao.HrBaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * VIEW Mapper 接口
 * </p>
 *
 * @author zhangchi
 * @since 2018-11-09
 */
public interface PosTreeVMapper extends HrBaseMapper<PosTreeV> {

    List<PosTreeV> getSubcateList(HashMap<Object, Object> params);

    List<posiVo> selectElebyPosId(String posId);

    List<PosTreeV> getMListById(String posId);

    List<PosTreeV> getKListByMId( HashMap<Object, Object> objectHashMap);

    List<PosTreeV> getSkListByKId(HashMap<Object, Object> objectHashMap);

    List<PosTreeV> getKListsByMId(@Param("ids") List<Object> objec, @Param("posId")String posId);

    List<PosTreeV> getSkListsByKId(@Param("ids")List<Object> objec2, @Param("posId")String posId);
}
