
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super2 s=new Super2();
		s.show();
		
		
	}

}
class Super1 
{
	int a=10;
	
}
class Super2 extends Super1
{
	int a=20;
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
}
