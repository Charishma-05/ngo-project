package com.ngoconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.ngoconnect" })
@EnableJpaRepositories(basePackages = { "com.ngoconnect.repository" })
@EntityScan(basePackages = { "com.ngoconnect.entity" })
public class NgoConnectBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NgoConnectBackendApplication.class, args);
    }
}