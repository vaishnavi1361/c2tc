package com.cg.singleInheritance;

public class student extends citizen{

	private int id;
	private String clgname;
	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public student(String name, String dob, String address, String aadhar, long phone,int id, String clgname) {
		super(name, dob, address, aadhar, phone);
		this.id = id;
		this.clgname = clgname;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	
	
	
}
