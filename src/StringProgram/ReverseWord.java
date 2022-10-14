package StringProgram;
//swap 1st and last word
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="I love Bangalore city";//city love Bangalore I
		//int a=10;
		//int b=20;
		//int temp=a;
		//a=b;
		//b=temp;
		
		//System.out.println(a);
		//System.out.println(b);
		String[]s=st.split(" ");
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++) 
		{
			System.out.print(s[i]+" ");
		}
		

	}

}
