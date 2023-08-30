package com.cg.overriding;

public class overriding {

	public static void main(String[] args) {
		rbi rb;
		//dynamic bimdng
		rb=new sbi();
		System.out.println(rb.getrateinterest());
		System.out.println(rb.getClass());
		rb=new hdfc();
		System.out.println(rb.getrateinterest());
		rb=new icici();
		System.out.println(rb.getrateinterest());

	}

}
//if lyk rb is used many times,the last one used is always executed,i.e its overriding