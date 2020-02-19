package com.volcanno.spring.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * waiter喊水开了
 * publisher是事件源 source,负责产生事件,并发布事件
 *
 * @author vayne
 * @date 2020-02-19 22:39
 **/
@Component
public class WaiterPublisher {

    @Autowired
    private ApplicationEventPublisher delPublisher;

    @Scheduled(fixedRate = 5000)
    public void sayHi() {
        System.out.println("start to publish.");
        BoilEvent event = new BoilEvent(this,100);
        this.delPublisher.publishEvent(event);
    }
}
