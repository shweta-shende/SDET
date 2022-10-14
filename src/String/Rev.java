package String;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=" my name is shwetaa";
		int leng=name.length();
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("reverse of "+name+" is "+rev);


	}

}
