package com.cg.string;

public class stringoperation {

	public static void main(String[] args) {
		String s="hi";
		String s1="    jhsadkdhskj    ";
		String s2="bye";
		String s3=s.concat(s2);
		String upper=s.toUpperCase();
		String lower=s.toLowerCase();
		System.out.println("len"+s.length());
		System.out.println("concat"+s3);
		System.out.println("upper"+upper);
		System.out.println("lower"+lower);
		System.out.println("substr"+s3.substring(1,3));
		System.out.println("trim"+s1.trim());
		System.out.println("left or ebg"+s1.stripTrailing());
		System.out.println("end or right"+s1.stripLeading());
		
		
		
		
		String g="one";
		String g1="one";
		String g2=new String("one");
		System.out.println(g==g1);     //gives true since similar allocation
		System.out.println(g==g2);    //gives false since its allocated differerntly
	}

}
