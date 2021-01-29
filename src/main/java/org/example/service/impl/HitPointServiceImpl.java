package org.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.HitPointMapper;
import org.example.po.HitPoint;
import org.example.service.HitPointService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wangweili
 * @version 1.0
 * @date 2021/1/25 5:54 下午
 */
@Service
@Transactional
public class HitPointServiceImpl extends ServiceImpl<HitPointMapper, HitPoint> implements HitPointService {

    /**
     * 记录点击数,回显点击总数
     *
     * @param hitPoint {@link HitPoint}
     * @return hitPoints
     */
    @Override
    public Integer recordHitTimes(HitPoint hitPoint) {
        QueryWrapper<HitPoint> wrapper = new QueryWrapper<>();
        wrapper.eq("ip_address", hitPoint.getIpAddress());
        if (getOne(wrapper) == null) {
            save(hitPoint);
        }
        baseMapper.recordHitTimes(hitPoint);
        return baseMapper.returnHitTimes(hitPoint);
    }

}
