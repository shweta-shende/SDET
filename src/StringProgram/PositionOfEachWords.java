package StringProgram;

import java.util.LinkedHashSet;

public class PositionOfEachWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I love I love Baglr city";
		String[] s=str.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<s.length;i++) 
		{
		set.add(s[i]);
			
		}
		for(String stri : set) 
		{
			
			for(int i=0;i<s.length;i++)
			{
				if(stri.equals(s[i]))
				{
					System.out.println(stri+" is present in " +(i+1)+" position ");
					break;
				}
				
			}
			
		}
	}

}
