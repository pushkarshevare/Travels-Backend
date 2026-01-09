package com.travels.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travels.project.model.InTouch;

@Repository
public interface InTouchRepository extends CrudRepository<InTouch, Integer>{

}
