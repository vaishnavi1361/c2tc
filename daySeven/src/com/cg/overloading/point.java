package com.cg.overloading;

public class point {
	private float x,y;
	
	public point() {//1
		x=0.1f;
		y=0.1f;
	}
	//error occurs so make changes in argument i.e int braces of point
	public point(int x) { //2
		x=5;
		//y=0.1f;
	}
	//if v give only int x,v get errpr on line 11 i.e 2 so give difference
	public point(int x,int y) {
		x=0;
		y=1;
	}
	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}
	
	
	

}
