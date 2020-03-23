package com.nero.springboot.event.custom;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

public class UserEventListener implements ApplicationListener<UserEvent> {
    @Override
    public void onApplicationEvent(UserEvent userEvent) {
        System.out.println("UserEvent--name-"+userEvent.getName());
    }
}
