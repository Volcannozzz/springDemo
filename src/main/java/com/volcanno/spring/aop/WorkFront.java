package com.volcanno.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * aop
 *
 * @author vayne
 * @date 2020-02-23 23:27
 **/
@Component
@Aspect
public class WorkFront {

    private static Logger logger = LoggerFactory.getLogger(WorkFront.class);

    /**
     * 在work方法之前进行信息登记.
     */
    @Before("execution(* com.volcanno.spring.aop.Worker.work())")
    public void sayHi() {
        logger.warn("My name is vayne.");
    }
}
