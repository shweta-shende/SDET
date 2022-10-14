
public class StaticMB {
	static int a=20;
	static void show()
	{
		System.out.println("static method");
	}
	static
	{
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		show();
	}

}
