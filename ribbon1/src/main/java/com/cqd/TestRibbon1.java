package com.cqd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class TestRibbon1 {
    public static void main(String[] args) {
        SpringApplication.run(TestRibbon1.class);
    }

    @RequestMapping("test1")
    public String test1(){
        System.out.println("-------test1--健康-----");
        return "test1 ^_^";
    }
}
