package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Profile;
@Profile(value="userName")
@Entity
public class UserProfileDetails {
	@NotNull
	@Id
	@Email()
	private String useremailId;
	@NotNull
	private String userName;
	@Size(min=10,max=400)
	private String address;
	@Size(min=10,max=11)
	private String mobile;
	private int age;
	private Date dob;
	
	public UserProfileDetails() {
		
	}

	public String getUseremailId() {
		return useremailId;
	}

	public void setUseremailId(String useremailId) {
		this.useremailId = useremailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}


}
