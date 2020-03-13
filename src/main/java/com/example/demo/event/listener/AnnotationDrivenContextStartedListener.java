package com.example.demo.event.listener;

import com.example.demo.event.event.GenericSpringEvent;
import com.example.demo.event.publisher.CustomSpringEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenContextStartedListener {

    @Autowired
    private CustomSpringEventPublisher customSpringEventPublisher;

    @EventListener
    public void handleContextStart(ContextStartedEvent cse) {
        System.out.println("Handling context started event.");
    }

    @EventListener(condition = "#event.success")
    public void handleSuccessful(GenericSpringEvent event) {
        System.out.println("Handling generic event (conditional).");
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        customSpringEventPublisher.doStuffAndPublishAnEvent("hello");
    }
}
