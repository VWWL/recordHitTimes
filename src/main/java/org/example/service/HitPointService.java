package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.po.HitPoint;

/**
 * @author wangweili
 * @version 1.0
 * @date 2021/1/25 5:53 下午
 */
public interface HitPointService extends IService<HitPoint> {
    
    Integer recordHitTimes(HitPoint hitPoint);
    
}
