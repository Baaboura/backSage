package com.example.Sage_PFE.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class cors implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // or specific origins
                .allowedMethods("GET", "POST", "PUT", "DELETE") // or specific methods
                .allowedHeaders("*"); // or specific headers
    }
}