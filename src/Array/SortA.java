package Array;

public class SortA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {33,22,1,5,99,34,43,90,41};
		int temp=0;
		System.out.println("original array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
		}
		}
		System.out.println("sorted array: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
