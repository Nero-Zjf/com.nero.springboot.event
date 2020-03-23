package com.nero.springboot.event;

import com.nero.springboot.event.custom.UserEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventApplication {

    public static void main(String[] args) {
      ConfigurableApplicationContext context = SpringApplication.run(EventApplication.class, args);
      context.publishEvent(new UserEvent("test", "nero"));
    }
}
