package SDET;

public class FirstSecondminNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,9,5,1};

		int fmin=arr[0];
		int smin=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=fmin) {
				if(arr[i]!=fmin) {
					smin=fmin;
				}
				fmin=arr[i];
			}
			else if(fmin==smin || arr[i]<smin) {
				smin=arr[i];
			}
		}
			System.out.println("first min value:"+fmin);
			System.out.println("second min value:"+smin);


	}

}
