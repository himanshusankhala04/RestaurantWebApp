package com.example.restaurant.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserdataDTO {
	private String emailid;
	private String uname;
	private String upassword;
	private int token;
	
	public UserdataDTO(String emailid, String uname, String upassword, int token) {
		this.emailid = emailid;
		this.uname = uname;
		this.upassword = upassword;
		this.setToken(token);
	}
	
	public UserdataDTO(@JsonProperty("emailid")  String emailid, String uname,@JsonProperty("password")  String upassword) {
		this.emailid = emailid;
		this.uname = uname;
		this.upassword = upassword;
	}
	
	public UserdataDTO(@JsonProperty("emailid") String emailid, @JsonProperty("password") String upassword) {
		this.emailid = emailid;
		this.upassword = upassword;
	}
	public UserdataDTO() {
		
	}
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}
	
}
