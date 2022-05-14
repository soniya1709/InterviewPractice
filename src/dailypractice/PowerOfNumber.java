package dailypractice;

public class PowerOfNumber {
public static void main(String[] args) {
	System.out.println(isPower(3,3));
	
	
}
public static int isPower(int n,int power)
{
	int res=1;
		for(int i=1;i<=power;i++)
		{
		res *=n;	
		}
	
	return res;
}
}
