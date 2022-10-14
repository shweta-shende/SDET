
public class Method0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(10, 20));
		System.out.println(Adder.add(20, 30, 5));

	}
	class Adder
	{
		static int add(int a,int b)
		{
			return a+b;
		}
		static int add(int a,int b,int c)
		{
			return a+b+c;
		}
	}

}
