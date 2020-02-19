package com.volcanno.spring.springevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 主人
 *
 * @author vayne
 * @date 2020-02-19 22:59
 **/
@Component
public class LoyalListener {

    @EventListener
    @Order(100)
    public void handBoil(BoilEvent event) {
        System.err.println("ok,the water is : " +event.getTimeStamp());
    }
}
