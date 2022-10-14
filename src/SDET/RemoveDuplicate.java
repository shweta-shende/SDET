package SDET;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,4,1,1,5,4};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++) 
		{
			hs.add(a[i]);
		}
		for(int n:hs)
		{
			System.out.print(n+" ");
		}

	}

}
