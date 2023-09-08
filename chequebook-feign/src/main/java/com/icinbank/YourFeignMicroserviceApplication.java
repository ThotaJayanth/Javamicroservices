package com.icinbank;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class YourFeignMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YourFeignMicroserviceApplication.class, args);
    }
}
