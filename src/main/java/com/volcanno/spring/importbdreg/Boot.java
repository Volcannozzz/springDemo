package com.volcanno.spring.importbdreg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * boot
 *
 * @author vayne
 * @date 2020-02-25 22:03
 **/
@SpringBootApplication
@Import(DummyBeanRegistrar.class)
public class Boot {

    private static Logger logger = LoggerFactory.getLogger(Boot.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Boot.class);
        DummyBean dummy = context.getBean(DummyBean.class);
        logger.info(dummy.getName());
    }
}
