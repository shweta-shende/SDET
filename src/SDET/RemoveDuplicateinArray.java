package SDET;

public class RemoveDuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,4,1,1,5,4};
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("found duplicate element:"+a[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("duplicate element notfound");
		}
	}

}
