package com.cg.hierarchical;

public class employee extends person{
	private int id;
	private float salary;
	private String designation;
	
	
	public employee(String name, String gender, long phone, String city, int id, float salary, String designation) {
		super(name, gender, phone, city);
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", salary=" + salary + ", designation=" + designation + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getPhone()=" + getPhone() + ", getCity()=" + getCity()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
