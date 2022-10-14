package StringProgram;
public class PrintDuplicateWithCountAssigm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {4,3,2,3,1};
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("print duplicate element:"+a[i]);
					flag=true;
				}
			}
		}
	}
	}
		
		


	

