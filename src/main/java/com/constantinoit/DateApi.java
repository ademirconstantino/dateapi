package com.constantinoit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DateApi {

    public static void main(String[] args) {
        SpringApplication.run(DateApi.class, args);
    }

}
