package Assignment;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		

	}
	static int count=0;
	static void m1() {
	count++;
	if(count<=5)
	{
		System.out.println("hello"+count);
		m1();
	}
	}
		

}
