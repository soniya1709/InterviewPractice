package dailypractice;

public class FibonacieSeries {
public static void main(String[] args) {
	int number=10,sum=0,first=0,second=1;
	System.out.println(first+ "\n"+second);
	for(int i=2;i<number;i++)
	{
		sum=first+second;
		first=second;
		second=sum;
		System.out.println(sum);
	}
	}
}