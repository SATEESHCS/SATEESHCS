package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
private String firstName;
private String lastName;
private String country;

LinkedHashMap<String, String> countryOptions;
private String favoriteLanguage;

private String [] operatingSystems;

public String getFavoriteLanguage() {
	return favoriteLanguage;
}

public void setFavoriteLanguage(String favoriteLanguage) {
	this.favoriteLanguage = favoriteLanguage;
}

public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}

public Student (){
	
	countryOptions = new LinkedHashMap<>();
	
	countryOptions.put("IN", "India");
	countryOptions.put("UK", "UK");
	countryOptions.put("USA", "USA");
	countryOptions.put("GR", "German");
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}


public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String[] getOperatingSystems() {
	return operatingSystems;
}

public void setOperatingSystems(String[] operatingSystems) {
	this.operatingSystems = operatingSystems;
}
}
