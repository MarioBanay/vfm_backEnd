package com.in28minutes.rest.webservices.restfulwebservices.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleJpaRepository extends JpaRepository<Vehicle, Long>{
	List<Vehicle> findByVin(String vin);
}