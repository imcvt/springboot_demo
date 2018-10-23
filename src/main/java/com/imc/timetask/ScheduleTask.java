package com.imc.timetask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author luoly
 * @date 2018/10/17 19:56
 * @description
 */

@Component
public class ScheduleTask{

    private int count=0;

    @Scheduled(cron="*/5 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing 定时任务：  "+(count++));
    }
}
