package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangweili
 * @version 1.0
 * @date 2021/1/25 5:43 下午
 */
@SpringBootApplication
@MapperScan("org.example.mapper")
public class RecordHitTimesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecordHitTimesApplication.class, args);
    }

}
