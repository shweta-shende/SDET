package StringProgram;

import java.util.LinkedHashSet;

public class PositionOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tester";//r=6,e=5,t=4,s=3
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)//ch=tesr
		{
			
			for(int i=s.length()-1;i>=0;i--)
			{
		
		if(ch==s.charAt(i)) 
		{
			System.out.println(ch+" is present in "+(i+1)+" position");
			break;
		}
			}		
}

	}

}
