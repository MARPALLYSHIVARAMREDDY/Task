package com.begins.department;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection = "EAIESB-1")
public class Department {

	@Id
	public String id;

	private int depNo;
	private String depId;
	private String depName;
	

}
