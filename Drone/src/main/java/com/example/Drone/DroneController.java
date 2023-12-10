package com.example.Drone;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="dronora/drones")
public class DroneController {
    @Autowired
    private DroneService droneService;

    @GetMapping("/ping")
    public String test() {
        return DroneService.pingDroneTest();
    }
    private final List<Drone> droneFleet = new ArrayList<>(); // []

    @GetMapping  // localhost:8081/drones -- list of all drones -- GET
    public List<Drone> getAllDrones() {
        return droneFleet;
    } // []

    @GetMapping("/{droneId}") // localhost:8081/drones/125 -- find specific drone data using id -- GET specific object
    public Drone getDrone(@PathVariable String droneId) {
        return droneFleet.stream()
                .filter(drone -> drone.getDroneId().equals(droneId))
                .findFirst()
                .orElse(null);
    }

    @PostMapping // localhost:8081/drones -- upload one drone data in the server -- POST {id, name, capacity, isActive}
    public String addDrone(@RequestBody Drone drone) {
        String id = drone.getDroneId();
        boolean idExists = droneFleet.stream().anyMatch(existingDrone -> existingDrone.getDroneId().equals(id));

        if (idExists) {
            return "Drone ID already exists, cannot add another drone with the same ID";
        } else {
            droneFleet.add(drone);
            return "Drone added successfully";
        }
    }

    @PutMapping("/{droneId}")
    public String updateDrone(@PathVariable String droneId, @RequestBody Drone updatedDrone) {
        for (Drone drone : droneFleet) {
            if (drone.getDroneId().equals(droneId)) {
                drone.setName(updatedDrone.getName());
                drone.setCapacity(updatedDrone.getCapacity());
                drone.setActiveStatus(updatedDrone.getActiveStatus());
                return "Drone updated successfully";
            }
        }
        return "Drone not found";
    }


    @DeleteMapping("/{droneId}") // localhost:8081/drones/125 -- Delete one drone data -- DELETE
    public String deleteDrone(@PathVariable String droneId) {
        return droneFleet.removeIf(drone -> drone.getDroneId().equals(droneId)) ? "Drone removed successfully" : "Drone not found";
    }


}


