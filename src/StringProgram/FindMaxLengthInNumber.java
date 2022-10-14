package StringProgram;

public class FindMaxLengthInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"12345678","1234","123","12","12345","11"};
		String minLength=s[0];//6
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()> minLength.length()) 
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
