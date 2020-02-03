package com.du.springboot_test.app;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(">>> MyApplicationRunner 执行");
        sayHelloWorld();
    }


    public void sayHelloWorld(){
        System.out.println("Hello World");
    }
}
