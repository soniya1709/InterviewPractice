package practice;

public class Patternprint2 {
public static void main(String[] args) {
	int n=6;
	for(int i=0;i<=n;i++)
	{
		for(int k=n;k>=i;k--)
		{
			System.out.print("  ");
		}
	
		for(int j=0;j<=i;j++)
		{
			System.out.print(" *");
		}
	
		System.out.println();
	}
}

}