package com.volcanno.spring.jdkevent;

import org.junit.Test;

import java.util.EventListener;

/**
 * jdk event unit test
 *
 * @author vayne
 * @date 2020-02-18 22:26
 **/
public class EventTest {
    @Test
    public void testJdkEvent(){
        WorkDownEventSource source = new WorkDownEventSource();
        EventListener listener1 = new WorkDownListener();
        EventListener listener2 = new WorkDownListener();
        source.registerListener(listener1);
        source.registerListener(listener2);
        source.change();
    }
}
