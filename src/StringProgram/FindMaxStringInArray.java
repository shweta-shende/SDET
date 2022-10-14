package StringProgram;

public class FindMaxStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"abcdef","avbp","qfq","ab","ewree"};//ab
		String maxLength=s[0];//6
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()> maxLength.length()) 
			{
				maxLength=s[i];
			}
	
		}
		for(int i=0;i<s.length;i++) 
		{
			if(s[i].length()==maxLength.length()) 
			{
				System.out.println(s[i]);
			}
		}

	}

}
