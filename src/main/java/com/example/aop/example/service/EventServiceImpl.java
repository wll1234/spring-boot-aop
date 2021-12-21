package com.example.aop.example.service;

import com.example.aop.example.annotation.CheckTime;
import com.example.aop.example.intf.EventService;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @CheckTime
    @Override
    public String test(String arg1, String arg2) {
        System.out.println("Service begin (" + arg1 + ", " + arg2 + ")");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Service end");
        return "Service done";
    }

    @CheckTime
    @Override
    public void exceptionTest() throws Exception {
        throw new Exception("Exception message");
    }
}
