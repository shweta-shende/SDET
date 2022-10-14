package SDET;

public class FirstMaxWithoutSorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {8,3,4,9,1,2,77,95};

		int fmax=arr[0];
		int smax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fmax) {
				fmax=arr[i];
			}
			else if(fmax==smax || arr[i]>smax) {
				smax=arr[i];
			}
		}
			System.out.println("first max value:"+fmax);
			System.out.println("second max value:"+smax);

	}

}
