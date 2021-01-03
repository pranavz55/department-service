package com.example.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		log.info("inside savedepartment method in department service");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long id) {
		// TODO Auto-generated method stub
		log.info("inside  findDepartmentById method in department service");
		return departmentRepository.findByDepartmentId(id);
	}
}
