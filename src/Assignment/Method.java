package Assignment;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m1=new Method();
		
		String name=m1.disp();
		System.out.println(name);
		System.out.println(m1.disp());

	}
	String disp()
	{
		System.out.println("method is running");
		return "shweta";
	}

}
