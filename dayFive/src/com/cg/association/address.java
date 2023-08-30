package com.cg.association;

public class address {
	private int no;
	private String streetname;
	private String city;
	private String state;
	private int pincode;
	public address(int no, String streetname, String city, String state, int pincode) {
		super();
		this.no = no;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "address [no=" + no + ", streetname=" + streetname + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	

}
