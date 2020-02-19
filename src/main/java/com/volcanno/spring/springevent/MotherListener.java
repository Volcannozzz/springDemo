package com.volcanno.spring.springevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * mother
 *
 * @author vayne
 * @date 2020-02-19 23:22
 **/
@Component
public class MotherListener {

    @EventListener
    @Order(1)
    public void warn(BoilEvent event) {
        System.err.println("mother say: hi,jack, the water is "+event.getTimeStamp());
    }
}
