package com.mjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyJavaSpringBootVueApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyJavaSpringBootVueApplication.class, args);
        System.out.println("hot-fix启动成功");
        System.out.println("hot-fix");
        System.out.println("master启动成功");
        System.out.println("冲突？");

    }

}
