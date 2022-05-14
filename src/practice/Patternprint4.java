package practice;

public class Patternprint4 {
public static void main(String[] args) {
	int n=6;
	for(int i=0;i<=n;i++)
	{
		for(int k=i;k>=i;k--)
		{
			System.out.print("  "+"  ");
		}
		for(int j=n;j>=i;j--)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}
