package Assignment;

import java.util.Scanner;

public class Fab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println(" enter 1st no ");
		int a=scn.nextInt();
		System.out.println(" enter 2nd no ");
		int b=scn.nextInt();
		System.out.println(" enter no of series");
		int n=scn.nextInt();
		System.out.println(a+" ");
		System.out.println(b+" ");
		for(int i=1;i<n;i++)
		{
			int c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
		

	}

}
