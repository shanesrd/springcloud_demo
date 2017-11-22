package me.shaneli.springcloud_demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Shane
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
