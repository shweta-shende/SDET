
public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 n1=new B1();
		
		

	}

}
class A1
{
	A1(int a)
	{
		System.out.println("hellow viewer"+a);
	}
}
class B1 extends A1
{
	B1()
	{
		super(200);
		System.out.println("hellow learner");
	}
	
}
