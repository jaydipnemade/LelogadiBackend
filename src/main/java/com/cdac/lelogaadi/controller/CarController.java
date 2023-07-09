package com.cdac.lelogaadi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.lelogaadi.model.Car;
import com.cdac.lelogaadi.repository.CarRepository;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class CarController {
	
	@Autowired
	private CarRepository carRepository;
	
	//Get all Cars
	@GetMapping("/cars") 
	public List<Car> getAllCars(){
		return carRepository.findAll();
	}

	@GetMapping("hello")
	public String helloWorld() {
		return "Hello World!!";
	}
}
