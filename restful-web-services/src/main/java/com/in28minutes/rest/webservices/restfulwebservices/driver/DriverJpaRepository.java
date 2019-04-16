package com.in28minutes.rest.webservices.restfulwebservices.driver;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverJpaRepository extends JpaRepository<Driver, Long>{
	List<Driver> findByUsername(String username);
}