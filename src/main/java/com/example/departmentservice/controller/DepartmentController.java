package com.example.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("inside savedepartment method in department controller");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable Long id) {
		log.info("inside findDepartmentById method in department controller");
		return departmentService.findDepartmentById(id);
	}
}
