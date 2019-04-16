package com.in28minutes.rest.webservices.restfulwebservices.driver;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class DriverJpaResource {
	
	@Autowired
	private DriverJpaRepository driverJpaRepository;

	
	@GetMapping("/jpa/users/{username}/drivers")
	public List<Driver> getAllTodos(@PathVariable String username){
		List<Driver> allDrivers = driverJpaRepository.findByUsername(username);
		System.out.println("All drivers: " + allDrivers);
		return allDrivers;
		
		
		//return todoService.findAll();
	}

	@GetMapping("/jpa/users/{username}/drivers/{id}")
	public Driver getTodo(@PathVariable String username, @PathVariable long id){
		return driverJpaRepository.findById(id).get();
		//return todoService.findById(id);
	}

	// DELETE /users/{username}/drivers/{id}
	@DeleteMapping("/jpa/users/{username}/drivers/{id}")
	public ResponseEntity<Void> deleteTodo(
			@PathVariable String username, @PathVariable long id) {

		driverJpaRepository.deleteById(id);

		return ResponseEntity.noContent().build();
	}
	

	//Edit/Update a Driver
	//PUT /users/{user_name}/drivers/{todo_id}
	@PutMapping("/jpa/users/{username}/drivers/{id}")
	public ResponseEntity<Driver> updateDriver(
			@PathVariable String username,
			@PathVariable long id, @RequestBody Driver driver){
		
		driver.setUsername(username);
		
		driverJpaRepository.save(driver);
		
		return new ResponseEntity<Driver>(driver, HttpStatus.OK);
	}
	
	@PostMapping("/jpa/users/{username}/drivers")
	public ResponseEntity<Void> createDriver(
			@PathVariable String username, @RequestBody Driver driver){
		
		driver.setUsername(username);
		
		Driver createdDriver = driverJpaRepository.save(driver);
		
		//Location
		//Get current resource url
		///{id}
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdDriver.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
		
}
