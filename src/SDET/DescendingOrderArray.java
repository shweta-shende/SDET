package SDET;

public class DescendingOrderArray {
//first maximum element -last index value
	//first minimum element-first index value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {8,3,4,9,1,2,77,95};
		System.out.println("descending order: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.println(arr[i]);

		}
		//System.out.println(arr[arr.length-1]);
		
			
		}
		 
			
		}


	


