package com.example.Drone;


import org.springframework.stereotype.Component;

@Component
public class DroneService {

    public static String pingDroneTest() {
        return "Ping Drone";
    }
}