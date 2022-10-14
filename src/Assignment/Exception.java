package Assignment;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int c=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("divisible by zero is not possible");
		}

	}

}
