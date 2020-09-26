package com.springboot.sportplay.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//全局配置类--配置跨域请求
@SuppressWarnings("deprecation")
@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                /**
                 * 1、与访问路径
                 * 2、请求方法
                 * 3、方法
                 * 4、允许携带
                 * 5、最大时间
                 */
                registry.addMapping("/**")
                        .allowedOrigins("*","null")
                        .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
                        .allowCredentials(true)
                        .maxAge(3600);
            }
        };
    }
}

//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
////全局配置类--配置跨域请求
//@Configuration
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        /**
//         * 1、与访问路径
//         * 2、请求方法
//         * 3、方法
//         * 4、允许携带
//         * 5、最大时间
//         */
//        registry.addMapping("/**")
//                .allowedOrigins("HTTP://localhost:9527","null")
//                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
//                .allowCredentials(true)
//                .maxAge(3600);
//    }
//}