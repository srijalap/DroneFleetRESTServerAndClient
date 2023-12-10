package com.example.Drone;

public class Drone {
    private String droneId;
    private String name;
    private int capacity;
    private boolean isActive;

    // Constructor
    public Drone(String id, String name, int capacity, boolean isActive) {
        this.droneId = id;
        this.name = name;
        this.capacity = capacity;
        this.isActive = isActive;
    }

    // Getters and setters for all properties

    public String getDroneId() {
        return droneId;
    }

    public void setDroneId(String droneId) {
        this.droneId = droneId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean getActiveStatus() {
        return  isActive;
    }

    public void setActiveStatus(boolean isActive) {
        this.isActive = isActive;
    }
}
