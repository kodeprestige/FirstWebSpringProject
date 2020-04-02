package com.kodeprestige.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class Koder {
	
	@NotEmpty(message="Requared field")
	private String firstName;

	@NotNull(message="Requared field")
	@Size(min=2, max=200, message="Your name must have at least two letters")
	private String lastName;
	
	@Min(value=10, message="You must be over 10 years old.")
	@Max(value=100, message="Really!!! You are very old")
	private int age;
	
	private String sex;
	
	@NotEmpty(message="Requared field")
	@Email
	private String email;
	
	private String languages;
	
	private String optionalSubject;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	
	
	public String getOptionalSubject() {
		return optionalSubject;
	}
	public void setOptionalSubject(String optionalSubject) {
		this.optionalSubject = optionalSubject;
	}

}
