package com.begins.college;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {
	@Autowired
	public CollegeRepository clgRepo;

	public College create(College clg) {
		return clgRepo.save(clg);
	}

	public List<College> getAll() {
		return clgRepo.findAll();
	}
	public Optional<College> getById(String id){
		return clgRepo.findById(id);
}
	 public College update(String id,College clg) {
		 clg.setId(id);
		return clgRepo.save(clg);
	 }
	 public String delete(String id) {
		 clgRepo.deleteById(id);
		return "College id : "+ id +" deleted.";
		 
	 }
}


