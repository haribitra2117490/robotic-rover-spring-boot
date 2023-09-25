package com.example.controller;



import com.example.model.RoboticRover;
import com.example.model.RoboticRoverRequest;
import com.example.service.RoboticRoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rover")
public class RoboticRoverController {
    private final RoboticRoverService roverService;

    @Autowired
    public RoboticRoverController(RoboticRoverService roverService) {
        this.roverService = roverService;
    }

    @PostMapping("/move")
    public RoboticRover moveRover(@RequestBody RoboticRoverRequest request) {
        return roverService.moveRover(request.getX(), request.getY(), request.getDirection(), request.getPositions());
    }
}

