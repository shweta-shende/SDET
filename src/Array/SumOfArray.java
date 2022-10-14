package Array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[] {2,3,5,9,7};
				
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements of array is "+sum);

	}

}
