package com.volcanno.spring.testscan;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * service ,include
 *
 * @author vayne
 * @date 2020-02-23 12:00
 **/
@Service
public class DemoService {

    @Scheduled(fixedRate = 5000)
    public void sayService() {
        System.err.println("::service");
    }
}
