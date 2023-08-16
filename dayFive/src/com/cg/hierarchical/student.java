package com.cg.hierarchical;

public class student extends person{
	private String department;
	private float cgpa;
	
	
	
	public student(String name, String gender, long phone, String city, String department, float cgpa) {
		super(name, gender, phone, city);
		this.department = department;
		this.cgpa = cgpa;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "student [department=" + department + ", cgpa=" + cgpa + ", getName()=" + getName() + ", getGender()="
				+ getGender() + ", getPhone()=" + getPhone() + ", getCity()=" + getCity() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
