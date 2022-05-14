package dailypractice;

public class BlockDemo {

	{
		System.out.println("instance block-1");
	}
	{
		System.out.println("instance block -2");
	}
	static
	{
		System.out.println("static block -1");
	}
	static
	{
		System.out.println("static block -2");
	}
	BlockDemo()
	{
		System.out.println("no -args");
	}
	BlockDemo(int a)
	{
		System.out.println("1- parameter"+a);
	}
	public static void main(String[] args) {
	new BlockDemo();
		new BlockDemo(20);
	}
}
