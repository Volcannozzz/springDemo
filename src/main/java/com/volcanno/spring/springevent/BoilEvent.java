package com.volcanno.spring.springevent;

import org.springframework.context.ApplicationEvent;

/**
 * 水开了事件
 *
 * @author vayne
 * @date 2020-02-19 22:22
 **/
public class BoilEvent extends ApplicationEvent {

    private int timeStamp;

    public int getTimeStamp() {
        return timeStamp;
    }

    public BoilEvent(Object source, int timeStamp) {
        super(source);
        this.timeStamp = timeStamp;
    }
}
