package StringProgram;

import java.util.LinkedHashSet;
//imp
public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tester";
		//HashSet<Character> set=new HashSet<Character>();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
			//i=0,0<6t
			//i=1 1<6t
			//i=2 2<6t
			//i=3  3<6t
			//i=4 4<6t
			//i=5 6<6t
			//i=6 6<6f terminate
		//{
			//System.out.println(s.charAt(i));
	//	}
		{
			set.add(s.charAt(i));
			System.out.println(set);
		}
		for(Character ch:set) {
			System.out.print(ch);
		}
			

	}

}
