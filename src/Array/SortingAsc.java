package Array;

public class SortingAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,9,88,66,45,32,23};
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
		System.out.println("elements of array sorted in ascending order");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
