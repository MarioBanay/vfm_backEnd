package com.in28minutes.rest.webservices.restfulwebservices.vehicle;

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
public class VehicleJpaResource {
	
	@Autowired
	private VehicleJpaRepository vehicleJpaRepository;

	
	@GetMapping("/jpa/users/{username}/vehicles")
	public List<Vehicle> getAllVehicles(@PathVariable String username){
		List<Vehicle> allVehicles = vehicleJpaRepository.findAll();
		return allVehicles;
			
	}

	@GetMapping("/jpa/users/{username}/vehicles/{id}")
	public Vehicle getVehicle(@PathVariable String username, @PathVariable long id){
		return vehicleJpaRepository.findById(id).get();
	}

	@DeleteMapping("/jpa/users/{username}/vehicles/{id}")
	public ResponseEntity<Void> deleteVehicle(
			@PathVariable String username, @PathVariable long id) {

		vehicleJpaRepository.deleteById(id);

		return ResponseEntity.noContent().build();
	}
	

	//Edit/Update a Vehicle
	//PUT /users/{user_name}/vehicles/{todo_id}
	@PutMapping("/jpa/users/{username}/vehicles/{id}")
	public ResponseEntity<Vehicle> updateVehicle(
			@PathVariable String username,
			@PathVariable long id, @RequestBody Vehicle vehicle){
				
		vehicleJpaRepository.save(vehicle);
		
		return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
	}
	
	@PostMapping("/jpa/users/{username}/vehicles")
	public ResponseEntity<Void> createVehicle(
			@PathVariable String username, @RequestBody Vehicle vehicle){
				
		Vehicle createdVehicle = vehicleJpaRepository.save(vehicle);
		
		//Location
		//Get current resource url
		///{id}
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdVehicle.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
		
}
