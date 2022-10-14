package PracticeProgram;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,4,3,5};
		int[]b= {1,5,8,2,9};
		int length=a.length;
		if(a.length<b.length) 
		{
			length=b.length;
		}
		for(int i=0;i<length;i++) 
		{
			try
			{
				System.out.println(a[i]+b[i]);
			}
			catch(Exception e)
			{
				if(a.length<b.length) 
				{
					System.out.println(b[i]);
				}
				else 
				{
					System.out.println(a[i]);
				}
			}
		}
		}
}


