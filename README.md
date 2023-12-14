
Drone Delivery System - Drone and Flight Management
I have both of the Drone server and flight management server inside the same directory in two folders.

Drone Service
The Drone Service is a Spring Boot application that manages drones. It includes functionalities to perform CRUD operations on drones, and it exposes a RESTful API for interaction. The service is built using Java and Spring Boot.
Key Components
DroneController: Handles HTTP requests related to drones, such as retrieving a list of drones, getting details of a specific drone, adding, updating, and deleting drones.

DroneService: Provides business logic for the drone-related operations. Includes a ping test method for checking the service's availability.

ErrorHandler: A global exception handler to manage various types of exceptions and provide appropriate HTTP responses.

Drone: Represents the data model for a drone, including attributes such as droneId, name, capacity, and isActive.

DroneApplication: The main class to run the Spring Boot application.

Getting Started
Clone the repository from https://gitlab.tamk.cloud/sw-architecturesdesign-2023-srijana-poudel/dronefleetrestserverandclient/-/tree/main/Drone?ref_type=heads
Open the project in your preferred Java IDE.
Run the DroneApplication class to start the Drone Service.
Explore the API using tools like Postman or curl. 
For the curl http://localhost:8081/dronora/drones
[{"id":"123","name":"Vim-v2","capacity":320}]% 


API Endpoints

GET /dronora/drones/ping: Test the availability of the drone service.

GET /dronora/drones: Retrieve a list of all drones.

GET /dronora/drones/{droneId}: Retrieve details of a specific drone by providing its ID.

POST /dronora/drones: Add a new drone by providing drone details in the request body.

PUT /dronora/drones/{droneId}: Update details of a specific drone by providing its ID and updated information in the request body.

DELETE /dronora/drones/{droneId}: Delete a specific drone by providing its ID.

Error Handling
The service includes a global exception handler (ErrorHandler) to manage different types of exceptions gracefully.

Fleet Service

The Fleet Service is a Spring Boot application responsible for managing drone flights. It communicates with the Drone Service to retrieve information about available drones and to order flights. The service is built using Java and Spring Boot.

Key Components
FleetController: Handles HTTP requests related to fleet operations, including a ping test and ordering a flight.

FleetService: Provides business logic for fleet-related operations. Communicates with the Drone Service to retrieve drone information and order flights.

Fleet: Represents the data model for a fleet, including attributes such as targetLatitude and targetLongitude.

FleetApplication: The main class to run the Spring Boot application.

To run project
Clone the repository from https://gitlab.tamk.cloud/sw-architecturesdesign-2023-srijana-poudel/dronefleetrestserverandclient/-/blob/main/fleet/src/main/java/com/example/fleet/Fleet.java?ref_type=heads
Open the project in your preferred Java IDE.
Run the FleetApplication class to start the Fleet Service.
Explore the API using tools like Postman or curl.curl http://localhost:8090/dronora/flights/ping

API Endpoints
GET /dronora/flights/ping: Test the availability of the fleet service.

Integration with Drone Service
The Fleet Service communicates with the Drone Service to retrieve information about available drones and to order flights.

Error Handling
The service includes a global exception handler (ErrorHandler) to manage different types of exceptions gracefully.






