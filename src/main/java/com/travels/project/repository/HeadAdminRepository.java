package com.travels.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travels.project.model.Head_Admin;

@Repository
public interface HeadAdminRepository extends CrudRepository<Head_Admin, Integer> {

}
