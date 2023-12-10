



package com.example.fleet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="dronora/flights")
public class FleetController {
    @Autowired
    private final FleetService fleetService;

    @Autowired
    public FleetController(FleetService fleetService) {
        this.fleetService = fleetService;
    }

    @GetMapping("/ping")
    public String test() {
        return fleetService.pingDroneUnit();
    }



}