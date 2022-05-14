package dailypractice;

public class ArmstrongNumber {
public static void main(String[] args) {
	int n=1245,rem=0,sum=0;
	int num=n;
	int count=0;

while(n!=0)
{
	rem=n%10;
	n=n/10;
	count++;
}
System.out.println(count);

while(num!=0)
{
	int res =1;
	rem=num%10;
	for(int i=1;i<=count;i++)
	{
		res=res*rem;
	
	}
	sum=sum+res;
	num=num/10;
	
	
}
System.out.println(sum);
}
}
