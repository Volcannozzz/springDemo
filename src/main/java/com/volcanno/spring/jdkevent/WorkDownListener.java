package com.volcanno.spring.jdkevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EventListener;

public class WorkDownListener implements EventListener {
    private static Logger logger = LoggerFactory.getLogger(WorkDownListener.class);

    /**
     * hand event
     *
     * @param event event
     */
    public void handEvent(EndWorkEventObject event) {
        System.out.println("hello,event");
        System.out.println("state is : {}" + event.getState());
    }

}
