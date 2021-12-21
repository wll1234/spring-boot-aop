package com.example.aop.example.controller;

import com.example.aop.example.intf.EventService;
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

    @GetMapping("")
    public void test(){
        System.out.println("Controller begin");
        String response = eventService.test("argument1", "argument2");
        System.out.println("Controller end. response = " + response);
    }
}
