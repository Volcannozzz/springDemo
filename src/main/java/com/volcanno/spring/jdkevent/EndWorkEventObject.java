package com.volcanno.spring.jdkevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EventObject;

public class EndWorkEventObject extends EventObject {

    private String state;

    private static final Logger logger = LoggerFactory.getLogger(EndWorkEventObject.class);

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EndWorkEventObject(Object source) {
        super(source);
        state = ((WorkDownEventSource)source).getState();
    }

    public String getState() {
        return state;
    }
}
