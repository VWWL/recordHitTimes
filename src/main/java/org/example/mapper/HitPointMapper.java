package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.po.HitPoint;

/**
 * @author wangweili
 * @version 1.0
 * @date 2021/1/25 5:52 下午
 */
public interface HitPointMapper extends BaseMapper<HitPoint> {
    
    @Update("update hitPoint set hit_points = hit_points + 1 where ip_address = #{ipAddress}")
    void recordHitTimes(HitPoint hitPoint);

    @Select("select hit_points from hitPoint where ip_address = #{ipAddress}")
    Integer returnHitTimes(HitPoint hitPoint);
    
}