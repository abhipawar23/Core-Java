package com.model;

public class User {

	private String name;
	private int id;
	private String address;
	private long mobileNo;
	private String mail;
	private int age;
	private String gender;
	private int pin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String toString() {
		return "Name=" + name + "\nID=" + id + "\nAddress=" + address + "\nMobile No=" + mobileNo + "\nMail ID=" + mail
				+ "\nAge=" + age + "\nGender=" + gender + "\nPin=" + pin + "";
	}

}
