package StringProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String s="welcome";
		//int leng=s.length();
		String rev="";
		//for(int i=leng-1;i>=0;i--)
		//{
			//rev=rev+s.charAt(i);
		//}
		//System.out.println("reverse of "+s+" is " +rev);

		
		

	//}
	//String st="welcome";
	//char[]s=st.toCharArray();
	//for(int i=s.length-1;i>=0;i--) {
	//	System.out.print(s[i]);
	//}
		
		
	String st="welcome";
	char[]s=st.toCharArray();
	int count=0;
	for(char c:s)
	{
		count++;
	}
	for(int i=count-1;i>=0;i--) 
	{
		System.out.print(s[i]);
	}
		
		
		//String s="welcome";
		//StringBuffer sb=new StringBuffer(s);
		//sb.reverse();
		//System.out.println(sb);
	}

}
