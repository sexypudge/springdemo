package com.example.demo.event.listener;

import com.example.demo.event.event.CustomSpringEvent;
import org.springframework.context.ApplicationListener;

public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        System.out.println("Received spring custom event - " + event.getMessage());
    }
}
