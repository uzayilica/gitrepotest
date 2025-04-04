package com.example.tsh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TshApplication {

    private static final Logger log = LoggerFactory.getLogger(TshApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TshApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            log.debug("program başlatıldı");
        };
    }

}
