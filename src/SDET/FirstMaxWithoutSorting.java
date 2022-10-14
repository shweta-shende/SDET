package SDET;

public class FirstMaxWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {3,9,8,5,7,2,88,44,32};
		int fmax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fmax) {
				fmax=arr[i];
			}
		}
		System.out.println("first max value is "+fmax);
		

	}

}
