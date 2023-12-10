package com.example.fleet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FleetService {
    private final RestTemplate restTemplate;
    // Constructor injection of RestTemplate
    @Autowired
    public FleetService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public String pingDroneUnit() {
        String response = "";
        response = restTemplate
                .getForObject("http://localhost:8081/dronora/drones", String.class);
        return response;
    }

    public void orderFlight(Fleet droneFlight) {

    }
}
