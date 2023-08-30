package com.cg.association;

public class person {
	private String name;
	private address adress;
	public person(String name, address adress) {
		super();
		this.name = name;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public address getAdress() {
		return adress;
	}
	public void setAdress(address adress) {
		this.adress = adress;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(adress);
	}
	

}
