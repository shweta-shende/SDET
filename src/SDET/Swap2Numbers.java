package SDET;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		System.out.println("before swap: value is = "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap: value is= "+a+" "+b);
				

	}

}
