package practice;

import java.util.Arrays;

public class StringWordCount {

	public static void main(String[] args) {
		
		
		String s="I'm Indian Citizen... I live in India. India has 27 state";
		s=s.replace(".", "");
		String[] s1=s.split(" ");		
		System.out.println(Arrays.toString(s1));		
				
				
			int count=1;
				
				
	for(int i=0;i<s1.length;i++)
	{
		for(int j=i+1;j<s1.length;j++)
		{
			if(s1[i].equals(s1[j]))
			{
				count++;
				System.out.println(s1[i] +"-" +count);
			}
		}
		for(int k=i;k>0;k--)
		{
			if(s1[i].equals(s1[k-1]))
		{
				count=0;
			}
	}
		
			
	}
	
	}
}
