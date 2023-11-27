package com.elitecoders.gestionetudiantahmedjemai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionEtudiantAhmedJemaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionEtudiantAhmedJemaiApplication.class, args);
    }

}
