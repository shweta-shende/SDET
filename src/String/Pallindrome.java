package String;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stubStrin
		String x="abcdcba";
		int i=0,j=x.length()-1;
		while(i<j)
		{
			if(x.charAt(i)!= x.charAt(j)) {
			System.out.println("not pallindrome");
			System.exit(0);
		}
		i++;
		j--;
	}
		System.out.println("pallindrome");
		

	}

}
