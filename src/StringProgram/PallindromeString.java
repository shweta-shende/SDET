package StringProgram;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("it is pallindrome");
		}
		else 
		{
			System.out.println("its not pallindrome");
		}

	}

}
