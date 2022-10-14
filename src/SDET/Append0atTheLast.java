package SDET;

public class Append0atTheLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,0,1,3,0,0};
		int m=0;
		int n=a.length-1;
		int temp[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				temp[m]=a[i];
				m++;
			}
			else
			{
				temp [n]=a[i];
				n--;
			}
		}
		for(int j=0;j<temp.length;j++) 
		{
			System.out.println(temp[j]);
		}

	}

}
