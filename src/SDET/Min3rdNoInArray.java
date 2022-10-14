package SDET;

public class Min3rdNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {4,1,3,2,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++) 
			{
				if(a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("3rd minimum is: "+a[a.length-3]);

	}

}
