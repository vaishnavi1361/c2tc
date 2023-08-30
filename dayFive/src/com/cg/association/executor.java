package com.cg.association;

public class executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//address a=new address(12,"5th","mysore","karnataka","560008");
		person p=new person("mary",new address(12,"5th","mysore","karnataka",21));
		p.display();

	}

}
