package com.c0822g1primaryschoolbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class C0822G1PrimaryschoolBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(C0822G1PrimaryschoolBeApplication.class, args);
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        System.out.println(passwordEncoder.encode("123"));
    }

}
