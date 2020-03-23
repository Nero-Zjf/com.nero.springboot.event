package com.nero.springboot.event.custom;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 */
public class UserEvent extends ApplicationEvent {
    /**
     * 用户名称
     */
    private String name;

    public UserEvent(Object source,String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
