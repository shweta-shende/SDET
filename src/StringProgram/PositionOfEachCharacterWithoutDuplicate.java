package StringProgram;

import java.util.LinkedHashSet;

public class PositionOfEachCharacterWithoutDuplicate {
//veryveryimp
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)//ch=tesr
		{
			
			for(int i=0;i<s.length();i++)
			{
		
		if(ch==s.charAt(i)) 
		{
			System.out.println(ch+" "+(i+1));
			break;
		}
			}		
}



	}

}
