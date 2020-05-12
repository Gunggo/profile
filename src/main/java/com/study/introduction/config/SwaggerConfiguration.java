package com.study.introduction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
    Swagger 설정파일
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(swaggerInfo()).select()
                /* 해당 패키지내의 컨트롤러 내용을 읽어 mapping 된 resource들을 문서화사킴.
                / paths에 any가 아닌 ant("/v1/**")로 v1으로 시작하는 resource들만 문서화 시킬 수 있음
                 */
                .apis(RequestHandlerSelectors.basePackage("com.study.introduction.web.controller"))
                .paths(PathSelectors.any())
                .build()
                // 기본으로 세팅되는 200,401,403,404 메시지를 표시하지 않음.
                .useDefaultResponseMessages(false);
    }

    private ApiInfo swaggerInfo() {
        return new ApiInfoBuilder().title("Spring API Documentation")
                .description("앱 개발시 사용되는 서버 API에 대한 연동 문서입니다")
                .license("IamBD").licenseUrl("https://gusehdqkd.com").version("1").build();
    }
}
