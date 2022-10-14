package StringProgram;

import java.util.Scanner;

public class FindFactorialOfANo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=5;//5*4*3*2*1=120
		System.out.println("enter a number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) 
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
