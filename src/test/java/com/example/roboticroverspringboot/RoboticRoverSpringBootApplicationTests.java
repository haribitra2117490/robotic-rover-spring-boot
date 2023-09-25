package com.example.roboticroverspringboot;

import com.example.service.RoboticRoverService;
import com.example.service.RoboticRoverServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



import com.example.model.RoboticRover;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticRoverSpringBootApplicationTests {
	private RoboticRoverService roverService;

	@BeforeEach
	public void setUp() {
		roverService = new RoboticRoverServiceImpl();
	}

	@Test
	public void testMoveRover1() {
		RoboticRover rover = roverService.moveRover(0, 0, 'N', "LMLMLMLMM");
		assertEquals(0, rover.getX());
		assertEquals(1, rover.getY());
		assertEquals('N', rover.getDirection());
	}

	@Test
	public void testScenario2() {
		// Test Case 1: 5 5, 1 2 N, LMLMLMLMM
		RoboticRover rover = roverService.moveRover(1, 2, 'N', "LMLMLMLMM");
		assertEquals(1, rover.getX());
		assertEquals(3, rover.getY());
		assertEquals('N', rover.getDirection());
	}

	@Test
	public void testScenario3() {
		// Test Case 2: 5 5, 3 3 E, MMRMMRMRRM
		RoboticRover rover = roverService.moveRover(3, 3, 'E', "MMRMMRMRRM");
		assertEquals(5, rover.getX());
		assertEquals(1, rover.getY());
		assertEquals('E', rover.getDirection());
	}
}
