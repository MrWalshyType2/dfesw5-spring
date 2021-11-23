package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.model.Car;

@RestController // allows us to send JSON data back, or other forms of data medium, indicates this is a component/bean to the AppContext
@RequestMapping(path = "/car")
public class CarController {
	
	List<Car> actualCars = List.of(
			new Car(2.0, 30000, 2010, "red", "mail", "van"),
			new Car(1.8, 45000, 2010, "blue", "big", "lorry")
	);
	// localhost:8080/car
	// 127.0.0.1:8080/car
	@GetMapping
	public ResponseEntity<List<Car>> get() {
		ResponseEntity<List<Car>> response = new ResponseEntity<List<Car>>(actualCars, HttpStatus.OK);
		
		return response;
	}
	
	// Path variables are specified in the url
	// i.e. localhost:8080/car/3 where 3 is the path variable
	@GetMapping(path = "/{id}") // the variable is specified in brackets
	public ResponseEntity<Optional<Car>> get(@PathVariable("id") Integer id) {
		// iterate over list
		for (int i = 0; i < actualCars.size(); i++) {
			// find element with id equal to the passed in id
			Car current = actualCars.get(i);
			
			// return found element or an empty Car object
			if (current.getId() == id) return new ResponseEntity<Optional<Car>>(Optional.of(current), HttpStatus.OK);
		}
		return new ResponseEntity<Optional<Car>>(Optional.empty(), HttpStatus.NOT_FOUND);
	}
	
	// Path variables are specified in the url
		// i.e. localhost:8080/car/3 where 3 is the path variable
		@GetMapping(path = "/alt/{id}") // the variable is specified in brackets
		public ResponseEntity<Car> getAlt(@PathVariable("id") Integer id) {
			Car current = null;
			// iterate over list
			for (int i = 0; i < actualCars.size(); i++) {
				// find element with id equal to the passed in id
				current = actualCars.get(i);
			}
			
			return ResponseEntity.of(Optional.ofNullable(current));
		}
}
