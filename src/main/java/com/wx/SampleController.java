package com.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Song on 2017/2/15.
 * 官方示例工程中的测试代码
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.**.mapper")
public class SampleController {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}