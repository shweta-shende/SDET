
public class MethodOverloadingChangingDataType {
	
	static int myMethod(int a,int b)
	{
		return a+b;
	}
	static double myMethod(double a,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MethodOverloadingChangingDataType.myMethod(9, 2));
		System.out.println(MethodOverloadingChangingDataType.myMethod(9.8, 8.3));
	}

}
