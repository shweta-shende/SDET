
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Static1.a);
		Static1.show();

	}

}
class Static1
{
	static int a=45;
	static void show()
	{
		System.out.println("static method");
	}
	static
	{
		System.out.println("static block");
	}
}