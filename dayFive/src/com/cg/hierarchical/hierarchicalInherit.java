package com.cg.hierarchical;

public class hierarchicalInherit {

	public static void main(String[] args) {
		person p = new person("hari","male",1235,"calcutta");
		System.out.println(p);
		
		p=new student();
		p=new employee();
		
		//person p2=new student();
		
		// TODO Auto-generated method stub

	}

}
