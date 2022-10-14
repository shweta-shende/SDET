package Assignment;

public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub"
		System.out.println("program started");
		new Saa(10.2);
		System.out.println("program ended");

	}

}
class Demo1
{
	Demo1(int a)
	{
		System.out.println("Demo running");
		System.out.println("value of a is :"+a);
	}
	}
class Saa extends Demo1
{
	Saa(double d)
	{
		super(5);
		System.out.println("sample running");
		System.out.println("value of d is: "+d);
		
	}
	}
