package com.cg.hierarchical;

public class person {
	private String name;
	private String gender;
	private long phone;
	private String city;
	
	
	
	public person(String name, String gender, long phone, String city) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", gender=" + gender + ", phone=" + phone + ", city=" + city + "]";
	}
	
	

}
