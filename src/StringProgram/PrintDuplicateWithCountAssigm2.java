package StringProgram;

import java.util.LinkedHashSet;

public class PrintDuplicateWithCountAssigm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {4,3,2,3,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(int num:set) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(count>=2)
				{
					count++;
				}
			}
			System.out.println(num+" occured "+count);
		}


	}

}