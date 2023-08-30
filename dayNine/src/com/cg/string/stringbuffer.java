package com.cg.string;

public class stringbuffer {

	public static void main(String[] args) {
		StringBuffer buffer1=new StringBuffer();
		StringBuffer buffer=new StringBuffer("morning");  //class name shudnt have keyword or identifier or predefined names
		System.out.println(buffer);
		System.out.println(buffer.length());  //no of chars
		System.out.println(buffer.capacity());  //checks for t memory allocated fr data given by u
		//index spaces at time of memory allocation
		
		System.out.println(buffer1.capacity());  //default capacity is 16,ltr watever v give,its length is added to 16
		StringBuffer b=new StringBuffer(100);
		System.out.println(b.capacity()); //if v give int value,it takes exact value as capacity

	}

}
