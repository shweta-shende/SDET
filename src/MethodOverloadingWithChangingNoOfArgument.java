
public class MethodOverloadingWithChangingNoOfArgument {
	
	static int add(int x,int y)
	{
		return x+y;
	}
	static int add (int x,int y,int z)
	{
		return x+y+z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MethodOverloadingWithChangingNoOfArgument.add(8, 8));
		System.out.println(MethodOverloadingWithChangingNoOfArgument.add(9, 6, 7));

	}

}
