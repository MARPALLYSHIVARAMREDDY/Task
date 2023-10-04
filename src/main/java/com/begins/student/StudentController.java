package com.begins.student;

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
public class StudentController {
	@Autowired
	public StudentService service;
	
	@PostMapping("/student")
	public Student createStudent(@Validated @RequestBody Student stu) {
		return service.create(stu);
	}
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return service.getAll();
}
	@GetMapping("/student/{id}")
	public Optional<Student> getStudentByID(@PathVariable String id) {
		return service.getById(id);
}
	@PutMapping("/student/{id}")
	public Student updateStudent(@PathVariable String id, @Validated @RequestBody Student stu) {
		return service.update(id, stu);
	}
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable String id) {
		service.delete(id);
		return "Student id : " + id + " deleted.";
	}
}