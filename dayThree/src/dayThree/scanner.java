package dayThree;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		String name;
		System.out.println("enter age");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("enter a name");
		name=sc.nextLine();
		System.out.println("the details are\n"+name+"\n"+age);
		// TODO Auto-generated method stub

	}

}
