package dailypractice;

import java.util.ArrayList;

public class NeonNumber {
	public static void main(String[] args) {
		int n=9;
		int res=n*n;
		
		while(res>0)
		{
			int sum=0;
			int sum1=0;
			int reminder=res%10;
			
				sum=sum+reminder;			
			res=res/10;
			
			System.out.println(sum);
		}
			
		}
	}



	