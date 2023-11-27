package com.elitecoders.gestionchambresalahmarabou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionChambreSalahMarabouApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionChambreSalahMarabouApplication.class, args);
    }

}
