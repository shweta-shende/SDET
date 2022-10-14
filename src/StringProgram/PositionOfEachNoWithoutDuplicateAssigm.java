package StringProgram;

import java.util.LinkedHashSet;

public class PositionOfEachNoWithoutDuplicateAssigm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {4,3,2,3,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(int n:set)
		{
			
			for(int i=0;i<a.length;i++)
			{
		
		if(n==a[i]) 
		{
			System.out.println(n+" "+(i+1));
			break;
		}
			}		
}

	}

}
