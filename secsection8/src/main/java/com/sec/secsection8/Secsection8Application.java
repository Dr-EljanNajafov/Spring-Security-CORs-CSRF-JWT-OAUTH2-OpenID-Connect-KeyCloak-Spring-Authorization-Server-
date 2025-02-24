package com.sec.secsection4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.sec.secsection8.repository")
@EntityScan(basePackages = "com.sec.secsection8.model")
public class Secsection8Application {

    public static void main(String[] args) {
        SpringApplication.run(Secsection8Application.class, args);
    }

}
