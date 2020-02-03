package com.du.springboot_test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootTestApplication {

    public static void main(String[] args) {

        System.out.println(">>>开始启动");
        SpringApplication.run(SpringbootTestApplication.class, args);
        System.out.println(">>>启动完成");
    }

}
