package com.nero.springboot.event;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 模拟实现CommandLineRunner来配置
 */
@Component
public class ConfigLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner.......................");
    }
}
