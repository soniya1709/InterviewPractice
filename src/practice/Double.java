package practice;

import java.util.Scanner;

public class Double {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		int i=sc.nextInt();
		System.out.println("enter double number");
		double d=sc.nextDouble();
		sc.nextLine();
		System.out.println("enter string");
		String s=sc.nextLine();
			sc.close();
		System.out.println("String"+s);
		System.out.println("Double"+d);
		System.out.println("integer"+i);
	}
}