package dailypractice;

public class StaticVariableinStaticBlock {
static String name="Deep";
static int age;
static
{
	name="shubh";
	System.out.println("Name="+name);
}
static
{
	System.out.println("age="+age);
}
public static void main(String[] args) {
	
}
}
