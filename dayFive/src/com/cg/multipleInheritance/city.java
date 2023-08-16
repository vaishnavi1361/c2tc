package com.cg.multipleInheritance;

public class city extends state{
	private String cityname;
	private int pincode;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "city [cityname=" + cityname + ", pincode=" + pincode + ", getStatename()=" + getStatename()
				+ ", getLanguage()=" + getLanguage() + ", toString()=" + super.toString() + ", getCountryname()="
				+ getCountryname() + ", getCapital()=" + getCapital() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	

}
