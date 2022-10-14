package Assignment;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=22;
		System.out.println("before swapping: ");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swapping: ");
		System.out.println("a ="+a);
		System.out.println("b ="+b);

	}

}
