package com.cdac.lelogaadi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.lelogaadi.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
