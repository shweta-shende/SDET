package Assignment;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="abcdedcba";
		int i=0,j=x.length()-1;
		while(i<j)
		{
			if(x.charAt(i)!= x.charAt(j))
			{
			System.out.println("its not pallindrome");
			System.exit(0);
		}
		i++;
		j--;

	}
		System.out.println("its pallindrome");
	}
	

}
