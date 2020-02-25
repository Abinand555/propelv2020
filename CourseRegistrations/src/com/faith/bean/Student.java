package com.faith.bean;

import java.util.Date;

public class Student {

	
	private Integer sid;
	private String sName;
	private Date dob;
	private String gender;
	private String address;
	private String email;
	private String phoneNum;
	private String qual;
	private String isActive;
	
	
	public Student() {
		super();
	}


	public Student(Integer sid, String sName, Date dob, String gender,
			String address, String email, String phoneNum, String qual,
			String isActive) {
		
		this.sid = sid;
		this.sName = sName;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.phoneNum = phoneNum;
		this.qual = qual;
		this.isActive = isActive;
	}


	public Student(String sName, Date dob, String gender, String address,
			String email, String phoneNum, String qual, String isActive) {
		super();
		this.sName = sName;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.phoneNum = phoneNum;
		this.qual = qual;
		this.isActive = isActive;
	}


	public Integer getSid() {
		return sid;
	}


	public void setSid(Integer sid) {
		this.sid = sid;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getQual() {
		return qual;
	}


	public void setQual(String qual) {
		this.qual = qual;
	}


	public String getIsActive() {
		return isActive;
	}


	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", dob=" + dob
				+ ", gender=" + gender + ", address=" + address + ", email="
				+ email + ", phoneNum=" + phoneNum + ", qual=" + qual
				+ ", isActive=" + isActive + "]";
	}
	
	
}
