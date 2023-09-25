package com.example.model;

import lombok.Getter;
import lombok.Setter;

public class RoboticRover {
    private int x;
    private int y;
    private char direction;

    public RoboticRover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(String positions) {
        for (int i = 0; i < positions.length(); i++) {
            char instruction = positions.charAt(i);
            if (instruction == 'L') {
                left();
            } else if (instruction == 'R') {
                right();
            } else if (instruction == 'M') {
                forward();
            }
        }
    }

    private void left() {

        if (direction == 'N') {
            direction = 'W';
        } else if (direction == 'E') {
            direction = 'N';
        } else if (direction == 'S') {
            direction = 'E';
        }else if (direction == 'W') {
            direction = 'S';
        }

    }

    private void right() {

        if (direction == 'N') {
            direction = 'E';
        } else if (direction == 'E') {
            direction = 'S';
        } else if (direction == 'S') {
            direction = 'W';
        }else if (direction == 'W') {
            direction = 'N';
        }

    }

    private void forward() {

        if (direction == 'N') {
            y++;
        } else if (direction == 'E') {
            x++;
        } else if (direction == 'S') {
            y--;
        }else if (direction == 'W') {
            x--;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }


}
