package com.begins.college;

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
public class CollegeController {

	@Autowired
	public CollegeService service;
	
	@PostMapping("/college")
	public College createCollege(@Validated @RequestBody College clg) {
		return service.create(clg);
	}
	@GetMapping("/colleges")
	public List<College> getAllColleges() {
		return service.getAll();
}
	@GetMapping("/college/{id}")
	public Optional<College> getCollegeByID(@PathVariable String id) {
		return service.getById(id);
}
	@PutMapping("/college/{id}")
	public College updateCollege(@PathVariable String id, @Validated @RequestBody College clg) {
		return service.update(id, clg);
	}
	@DeleteMapping("/college/{id}")
	public String deleteCollege(@PathVariable String id) {
		service.delete(id);
		return "College id : " + id + " deleted.";
	}
}
