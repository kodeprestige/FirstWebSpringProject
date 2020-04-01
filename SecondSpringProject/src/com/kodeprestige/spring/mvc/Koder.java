package com.kodeprestige.spring.mvc;

public class Koder {
	
	private String firstName;
	private String lastName;
	
	private String sex;
	
	private String languages;
	
	private String optionalSubject;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
