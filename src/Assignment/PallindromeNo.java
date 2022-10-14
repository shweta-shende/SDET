package Assignment;

import java.util.Scanner;

public class PallindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter no ");
		int n=scn.nextInt();
		int a=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum*10+r;
			n/=10;
		}
		if(sum==a)
		{
			System.out.println("the given no "+a+" is pallindrome");
		}
		else
		{
			System.out.println("the given no "+a+" is not pallindrome");
		}

	}

}
