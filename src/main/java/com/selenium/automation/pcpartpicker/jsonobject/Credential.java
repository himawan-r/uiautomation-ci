package com.selenium.automation.pcpartpicker.jsonobject;

public class Credential {

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Credential withUsername(String username) {
		this.username = username;
		return this;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Credential withPassword(String password) {
		this.password = password;
		return this;
	}

}
