package Assignment;

class Sample1
{
	void test()
	{
		System.out.println("running test()");
	}
	}
class Sample2 extends Sample1
{
	void test(int a)
	{
		System.out.println("running test() args");
		System.out.println("value of a is "+a);
	}
	}








public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s=new Sample2();
		s.test();
		s.test(10);

	}

}
