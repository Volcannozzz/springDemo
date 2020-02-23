package com.volcanno.spring.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * bot
 * VMOptions:
 * -javaagent:repoPath\spring-instrument-5.2.3.RELEASE.jar
 *
 * @author vayne
 * @date 2020-02-23 23:41
 **/
@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
@EnableLoadTimeWeaving
public class Boot {

    public static void main(String[] args) {
        SpringApplication.run(Boot.class);
    }
}
