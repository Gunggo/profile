package com.study.introduction;

import com.study.introduction.config.yaml.YamlPropertySourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@PropertySources({
        @PropertySource(value = "file:c:/configure/application.yml", ignoreResourceNotFound = true, factory = YamlPropertySourceFactory.class),
        @PropertySource(value = "file:${user.home}/config/application.yml", ignoreResourceNotFound = true, factory = YamlPropertySourceFactory.class),
})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}
