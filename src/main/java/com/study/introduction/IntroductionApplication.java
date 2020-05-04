package com.study.introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class IntroductionApplication {

    public static final String APPLCATION_LOCATIONS = "spring.config.location=" +
            "classpath:application.yml," +
            "/app/config/spring-portfiolio/real-application.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(IntroductionApplication.class)
                .properties(APPLCATION_LOCATIONS)
                .run(args);
    }

}
