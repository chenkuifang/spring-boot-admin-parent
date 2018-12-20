package com.example;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * spring boot admin server bootstrap
 *
 * @author Quifar
 * @version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class MonitorApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MonitorApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
