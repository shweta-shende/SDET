package Assignment;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=44;
		int b=33;
		int temp;
		System.out.println("before swapping a ="+a);
		System.out.println("before swapping b ="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("----------------------------");
		System.out.println("after swapping a ="+a);
		System.out.println("after swapping b ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		

	}

}
