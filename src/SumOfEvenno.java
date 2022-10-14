import java.util.Scanner;

public class SumOfEvenno {
	//sum of all even number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n,i,evenSum=0;
		System.out.println("enter any number");
		 n=scn.nextInt();
		 for(i=1;i<=n;i++) 
		 {
			 if(i%2==0)
			 {
				 evenSum=evenSum+i;
			 }
		 }
		 System.out.println("the sum of even number upto"+n+"="+evenSum);

	}

}
