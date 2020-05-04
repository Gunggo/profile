package com.study.introduction;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class IntroductionApplication {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "/home/ec2-user/app/config/spring-portfolio/real-application.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(IntroductionApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }

}
