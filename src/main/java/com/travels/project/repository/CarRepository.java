package com.travels.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.travels.project.model.Cars;

public interface CarRepository extends CrudRepository<Cars, Integer> {

}
