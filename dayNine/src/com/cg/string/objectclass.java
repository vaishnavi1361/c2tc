package com.cg.string;
class demo{
	
}
class example{
	public example(){
		System.out.println("in constructor");
	}
	protected void finalize() {   //protected keyword shud b used
		System.out.println("in finalize");
	}
}


public class objectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		demo d1=new demo();
		System.out.println(d.getClass());  //output is class com.cg.string.demo   points to package name n class name
		System.out.println(d.getClass().getName());
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		
		example e=new example();
		example e1=e;  //gives same hashcode
		System.out.println(e.getClass());
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		e=null;
		System.out.println(e1.hashCode());
		System.out.println(e.hashCode());

	}

}
