package StringProgram;

public class WithDuplicateStringAssigm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="india";//3
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i< ch.length;i++) 
		{
			if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' || ch[i]=='o' || ch[i]=='u') 
			{
				count++;
				System.out.print(ch[i]);
			}
			
		}
		System.out.println(" = "+count);//3


	}

}
