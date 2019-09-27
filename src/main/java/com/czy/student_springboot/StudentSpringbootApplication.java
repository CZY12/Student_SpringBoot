package com.czy.student_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.czy")
@MapperScan("com.czy.dao")
public class StudentSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentSpringbootApplication.class, args);
    }

}
