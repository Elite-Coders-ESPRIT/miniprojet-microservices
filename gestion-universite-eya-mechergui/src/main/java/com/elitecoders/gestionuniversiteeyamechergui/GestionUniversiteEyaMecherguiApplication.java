package com.elitecoders.gestionuniversiteeyamechergui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionUniversiteEyaMecherguiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionUniversiteEyaMecherguiApplication.class, args);
    }

}
