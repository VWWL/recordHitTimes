package org.example.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangweili
 * @version 1.0
 * @date 2021/1/25 5:50 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "hitPoint")
public class HitPoint {

    /**
     * ip地址
     */
    private String ipAddress;

    /**
     * 点击次数
     */
    private Integer hitPoints;
    
}
