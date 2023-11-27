package com.elitecoders.gestionblocmoatazfoudhaili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionBlocMoatazFoudhailiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionBlocMoatazFoudhailiApplication.class, args);
    }

}
