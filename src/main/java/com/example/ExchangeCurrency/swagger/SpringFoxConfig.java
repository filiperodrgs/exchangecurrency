//
//package com.example.ExchangeCurrency.swagger;
//import org.springframework.context.annotation.Bean;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//
//
//
//public class SpringFoxConfig {
//
//    private static final String title = "Exchange currencies API";
//    private static final String version = "1.0";
//    private static final String description = "Restful API to get exchange rates from different currencies";
//
//    private ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title(title)
//                .description(description)
//                .version(version).build();
//    }
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .pathMapping("/")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example"))
//                .paths(PathSelectors.regex("/api.*"))
//                .build();
//    }
//}
//
//



