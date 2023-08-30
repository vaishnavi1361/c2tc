package com.cg.wrapper;

public class wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=9;  //primtive type
		
		//unboxing method
		Integer o=new Integer(9);  //wrapper or object type
		int k=o.intValue();  //convert wrapper to primitive type
		
		//autoboxing method
		int y=1;
		Integer x=new Integer(1);  //older version
		
		
		Integer u=1;  //newer version
		System.out.println(args[0]);

	}

}
