package com.yunhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class EnrollstudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnrollstudentApplication.class, args);
    }

}
