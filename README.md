# Robotic Rover Spring Boot Application

This Spring Boot application simulates the movement of a robotic rover on a grid. You can use the provided REST API to send rover input data and retrieve the final position and direction of the rover.

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Spring Boot
- Postman or any REST API testing tool

## Getting Started

1. Clone or download this repository to your local machine.

2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA or Eclipse).

3. Build and run the Spring Boot application.

4. The application will start, and the REST API will be available at `http://localhost:8080/rover/move`.

## Testing the API

You can test the API using a tool like Postman or by sending HTTP requests programmatically. Here are the steps to test the functionality:

## Send a POST Request to Move the Rover

- Endpoint: `http://localhost:8080/rover/move`

- Request Method: POST

- Request Body (JSON):

  ```json
  {
    "x": 1,
    "y": 2,
    "initialDirection": "N",
    "positions": "LMLMLMLMM"
  }

<img width="1535" alt="image" src="https://github.com/haribitra2117490/robotic-rover-spring-boot/assets/127278560/f2e9ef4e-732c-494c-ada3-b4af69d38b7c">

## Test Cases
You can create test cases to verify the functionality of the Robotic Rover application. Here are some example test cases to get you started:


## Test Case : Move Rover North

{
  "x": 1,
  "y": 2,
  "initialDirection": "N",
  "positions": "MMMM"
}

## Expected Output:

{
  "x": 1,
  "y": 6,
  "direction": "N"
}

## Test Case 2: Turn and Move Rover
{
  "x": 3,
  "y": 3,
  "initialDirection": "E",
  "positions": "MMRMMRMRRM"
}

## Expected Output:

{
  "x": 5,
  "y": 1,
  "direction": "E"
}


 
