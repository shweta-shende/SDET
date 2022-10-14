package Assignment;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a no ");
		int n=scn.nextInt();
		int a=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println("its armstrong");
		}
		else
		{
			System.out.println("its not armstrong");
		}
				

	}

}
