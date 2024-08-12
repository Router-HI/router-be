package org.router.apimodule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = "org.router")
public class ApiModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiModuleApplication.class, args);
        log.info("Router Server Started!");
    }

}
