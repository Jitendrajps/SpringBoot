package com.springboot.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.app.beans.EmployeeDetails;

public interface EmployeeDAO extends MongoRepository<EmployeeDetails,String>{

}