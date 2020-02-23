package com.volcanno.spring.conditional;

import com.volcanno.spring.jdkevent.WorkDownEventSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * work
 *
 * @author vayne
 * @date 2020-02-23 15:27
 **/
@Component
public class WorkBean {

    private static Logger logger = LoggerFactory.getLogger(WorkBean.class);

    final
    ApplicationContext context;

    public WorkBean(ApplicationContext context) {
        this.context = context;
    }

    @Scheduled(fixedRate = 3000)
    public void printListCmd() {
        String cmd = context.getBean(SystemListService.class).getListFileCmd();
        logger.info("current os list cmd : {}", cmd);

    }
}
