package com.crud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String name;
	@Id
	private String username;
	
	
	private String email;
	
	@Size(min = 10 , max = 10 , message = "Phno must be 10 digit")
	private String phoneno;
	private String password;
	private String confpassword;
	private String gender;
	
	
	
	
}
