package com.volcanno.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * worker
 *
 * @author vayne
 * @date 2020-02-23 23:26
 **/
@Component
public class Worker {

    private static Logger logger = LoggerFactory.getLogger(Worker.class);

    @Scheduled(fixedRate = 3000)
    public void work() {
        logger.error("I am working.");
    }
}
