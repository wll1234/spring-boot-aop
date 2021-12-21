package com.example.aop.example.service;

import com.example.aop.example.annotation.CheckTime;
import com.example.aop.example.intf.EventService;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @CheckTime
    @Override
    public void test() {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Created an event");

    }
}
