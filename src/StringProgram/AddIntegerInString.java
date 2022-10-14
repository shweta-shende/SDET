package StringProgram;

public class AddIntegerInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "b2c3d1";
		int sum=0;
		char[]st=s.toCharArray();
		for(int i=0;i<s.length();i++) 
		{
			if(st[1]>=48 && st[i]<57) 
			{
				sum=sum+(st[i]-48);
			}
		}
		System.out.println(sum);

	}

}
