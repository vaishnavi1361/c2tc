package com.cg.overloading;

public class overloading {
	public static int add(int a,int b) { //m1
		return a+b;
	}
	
	public static float add(float a,float b) {  //m2 make changes in the arguments
		return a+b;
	}
	
	public static float add(int a,float b) {  //m3 dataype differemt      u can make any one as int n other as float among a and b
		return a+b;
	}
	
	public static int add(float a,int b) {  //m4    return type overloading alone isnt possible
		return a+b;
	}
	
	public static float add(float a,int b) {  //m5 
		return a+b;
	}


}
