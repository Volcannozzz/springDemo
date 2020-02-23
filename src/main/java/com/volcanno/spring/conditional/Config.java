package com.volcanno.spring.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * config
 *
 * @author vayne
 * @date 2020-02-23 15:22
 **/
@Configuration
public class Config {

    @Bean
    @Conditional(LinuxCondition.class)
    public LinuxListService getLinuxBean() {
        return new LinuxListService();
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public WindowsListService getWindowsBean() {
        return new WindowsListService();
    }

}
