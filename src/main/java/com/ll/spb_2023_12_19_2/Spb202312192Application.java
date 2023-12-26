package com.ll.spb_2023_12_19_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Spb202312192Application {

    public static void main(String[] args) {
        SpringApplication.run(Spb202312192Application.class, args);
    }

}
