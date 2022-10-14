package String;

public class Fab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("enter 1st no");
		int a=scn.nextInt();
		System.out.println("enter 2nd no");
		int b=scn.nextInt();
		System.out.println("enter  no of series");
		int n=scn.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}

	}

}
