package com.nero.springboot.event.custom;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 使用@EventListener注册监听器
 */
@Component
public class UserEventListener2 {
    @EventListener
    public void listen(UserEvent event) {
        System.out.println("UserEvent..........");
    }
}
