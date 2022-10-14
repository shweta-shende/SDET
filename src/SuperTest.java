
public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B n =new B();
		n.show();

	}

}
class A
{
	void show()
	{
		System.out.println("hello viewer");
	}
}
class B extends A
{
	void show()
	{
		super.show();
		System.out.println("hello learner");
	}
}
