package com.begins.department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@Autowired
	public DepartmentService service;
	
	@PostMapping("/department")
	public Department createDepartment(@Validated @RequestBody Department dep) {
		return service.create(dep);
	}
	@GetMapping("/departments")
	public List<Department> getAllDepartments() {
		return service.getAll();
}
	@GetMapping("/department/{id}")
	public Optional<Department> getDepartmentByID(@PathVariable String id) {
		return service.getById(id);
}
	@PutMapping("/department/{id}")
	public Department updateDepartment(@PathVariable String id, @Validated @RequestBody Department dep) {
		return service.update(id, dep);
	}
	@DeleteMapping("/department/{id}")
	public String deleteDepartment(@PathVariable String id) {
		service.delete(id);
		return "Department id : " + id + " deleted.";
	}
}


