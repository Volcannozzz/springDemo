package com.volcanno.spring.testscan;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

/**
 * dummy controller ,exclude
 *
 * @author vayne
 * @date 2020-02-23 11:59
 **/
@Controller
public class DummyController {

    @Scheduled(fixedRate = 5000)
    public void sayController() {
        System.err.println("::Controller");
    }

}
