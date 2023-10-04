package com.begins.college;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "EAIESB-3")
public class College {

	@Id
	public String id;

	private String clgId;
	private String clgName;

}
