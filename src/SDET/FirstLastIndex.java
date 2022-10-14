package SDET;

public class FirstLastIndex {
	//first maximum element -last index value
		//first minimum element-first index value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {8,3,4,9,1,2,77,95};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		

		}
		System.out.println("max "+arr[arr.length-1]);
System.out.println("min "+arr[0]);
	}

}
