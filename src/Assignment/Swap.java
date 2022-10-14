package Assignment;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before swapping");
		System.out.println("a= "+Swap.a);
		System.out.println("b= "+Swap.b);
		System.out.println("after swapping");
		Swap.a=Swap.a+Swap.b;
		Swap.b=Swap.a-Swap.b;
		Swap.a=Swap.a-Swap.b;
		System.out.println("value of a is "+Swap.a);
		System.out.println("value of b is "+Swap.b);
	

	}
	static int a=10;
	static int b=20;
	

	

}
