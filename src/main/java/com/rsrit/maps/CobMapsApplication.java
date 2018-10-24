package com.rsrit.maps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.rsrit.maps.documentation.SwaggerConfig;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class CobMapsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CobMapsApplication.class, args);
    }
}
