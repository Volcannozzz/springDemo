package com.volcanno.spring.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * test @componentScan
 *
 * @author vayne
 * @date 2020-02-23 12:02
 **/
@ComponentScan(basePackages = "com.volcanno.spring.testscan",excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})})
//@ComponentScan(basePackages = "com.volcanno.spring.testscan",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})})
@Configuration
public class DemoComponentScanConfig {

}
