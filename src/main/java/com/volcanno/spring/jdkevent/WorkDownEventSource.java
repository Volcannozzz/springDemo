package com.volcanno.spring.jdkevent;

import java.util.EventListener;
import java.util.HashSet;
import java.util.Set;

/**
 * @author vayne
 * @date 2020-2-18 22:05:25
 */
public class WorkDownEventSource {

    private String state;

    public WorkDownEventSource(){
        state = "hello";
    }

    private final Set<EventListener> listeners = new HashSet<>(16);
    /**
     * 注册监听器
     * @param listener listener
     */
    public void registerListener(EventListener listener) {
        listeners.add(listener);
    }

    /**
     * 通知监听器
     */
    public void notifyListener() {
        for (EventListener listener : listeners) {
            ((WorkDownListener) listener).handEvent(new EndWorkEventObject(this));
        }
    }

    public String getState() {
        return state;
    }

    public void change(){
        state = "world";
        notifyListener();
    }
}
