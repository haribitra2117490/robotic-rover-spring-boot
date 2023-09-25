package com.example.service;


import com.example.model.RoboticRover;
import org.springframework.stereotype.Service;

@Service
public class RoboticRoverServiceImpl implements RoboticRoverService {

    @Override
    public RoboticRover moveRover(int x, int y, char direction, String positions) {
        RoboticRover rover =  new RoboticRover(x, y, direction);
        rover.move(positions);
        return rover;
    }
}




