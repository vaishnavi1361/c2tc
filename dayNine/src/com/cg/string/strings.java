package com.cg.string;

public class strings {
	public static void main(String[] args) {
		String s="hi";
		String s1=s.concat("good");
		System.out.println(s1);
		
		
		//buffer can b used to overcome immutability meaning in above concatted data can b printed only after allocating it tosome other variable
		//but int the below method,its nt needed
		StringBuffer s="hi"; //gives error coz v use buffer
		StringBuffer s2=new StringBuffer("hi");
		s2.append("good");
		System.out.println(s2);
	}

}
