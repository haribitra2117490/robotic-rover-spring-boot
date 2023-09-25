package com.example.service;



import com.example.model.RoboticRover;

public interface RoboticRoverService {
    RoboticRover moveRover(int x, int y, char direction, String positions);
}

