import java.util.Scanner;

public class SumOfOddno {
	//sum of all odd number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n,i,oddSum=0;
		System.out.println("enter any number");
		n=scn.nextInt();
		for(i=1;i<=n;i++)
			if(i%2==1)
			{
				oddSum=oddSum+i;
			}
		System.out.println("the sum of "+n+" odd number is "+oddSum);

	}

}
