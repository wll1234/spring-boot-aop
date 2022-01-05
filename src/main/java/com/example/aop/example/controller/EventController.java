package com.example.aop.example.controller;

import com.example.aop.example.annotation.Benchmark;
import com.example.aop.example.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class EventController {

    EventService eventService;

    @Autowired
    public void setEventService(EventService eventService){
        this.eventService = eventService;
    }

    @Benchmark
    @GetMapping("")
    public String test(){
        System.out.println("Controller begin");
        String response = eventService.test("argument1", "argument2");
        System.out.println("Controller response = " + response);
        System.out.println("==========================================");
        try {
            eventService.exceptionTest();
        } catch (Exception e) {
            System.out.println("Controller Exception! message = " + e.getMessage());
        }
        System.out.println("Controller end");
        return "TEST END";
    }
}
