package StringProgram;

public class SegregateCharacter {
//find minimum length in string array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"abcdef","avbp","qfq","ab","ewree","cd"};//ab
		String minLength=s[0];//6
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()< minLength.length()) 
			{
				minLength=s[i];
			}
		}
		for(int i=0;i<s.length;i++) 
		{
			if(s[i].length()==minLength.length()) 
			{
				System.out.println(s[i]);
			}
		}
		
		
		
		

	}

}
