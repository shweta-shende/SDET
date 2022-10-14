package StringProgram;

public class SumOfTwoDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="11b21c3";//35
		int sum=0;//0 11 32
		int tsum=0;//0 1 11 0 2 21 0 3
		
		for(int i=0;i<s.length();i++) 
			//i=0 0<7t
			//i=1 1<7t
			//i=2 2<7t
			//i=7 7<7 terminate
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
			int n=s.charAt(i)-48;//49-48=1,49-48,n=51-48=3
			tsum=tsum*10+n;//tsum=0*10+3
			}
			else 
			{
				sum=sum+tsum;//sum=0+11,11+21
				tsum=0;//0 0
			}
			}
			sum=sum+tsum;//32+3=35
		    System.out.println(sum);//35
	}
}
