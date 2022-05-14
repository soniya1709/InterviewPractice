package dailypractice;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	boolean flag=false;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag=true;
		
		}
	}
	if(!flag)
	{
		System.out.println("It is prime number"+n);
	}
	else
	{
		System.out.println("It is not prime number"+n);
	}
}
}
