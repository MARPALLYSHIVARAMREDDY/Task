package com.begins.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	public StudentRepository stuRepo;

	public Student create(Student stu) {
		return stuRepo.save(stu);
	}

	public List<Student> getAll() {
		return stuRepo.findAll();
	}
	public Optional<Student> getById(String id){
		return stuRepo.findById(id);
}
	 public Student update(String id,Student stu) {
		 stu.setId(id);
		return stuRepo.save(stu);
	 }
	 public String delete(String id) {
		 stuRepo.deleteById(id);
		return "Student id : "+ id +" deleted.";
		 
	 }
}
