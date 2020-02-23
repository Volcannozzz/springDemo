package com.volcanno.spring.conditional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * boot
 *
 * @author vayne
 * @date 2020-02-23 15:25
 **/
@SpringBootApplication
@EnableScheduling
public class Boot {
    public static void main(String[] args) {
        SpringApplication.run(Boot.class);
    }
}
