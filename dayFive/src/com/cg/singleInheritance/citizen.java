package com.cg.singleInheritance;

public class citizen {
	private String name;
	private String dob;
	private String address;
	private String aadhar;
	private long phone;
	
	
	
	public citizen() {
		System.out.println("created");
		// TODO Auto-generated constructor stub
	}
	
	
	public citizen(String name, String dob, String address, String aadhar, long phone) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.aadhar = aadhar;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "citizen [name=" + name + ", dob=" + dob + ", address=" + address + ", aadhar=" + aadhar + ", phone="
				+ phone + "]";
	}
	
	


}
