
public class Constructor1 {
	
	String name,subject;
	int rollNo,classId;
	Constructor1()
	{
		name="shweta";
		subject="maths";
		rollNo=1234;
		classId=23;
	}
	Constructor1(String str,String sub,int n,int id)
	{
		name=str;
		subject=sub;
		rollNo=n;
		classId=id;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 c1=new Constructor1();
		Constructor1 c2=new Constructor1("sweetu","geo",3456,55);
		System.out.println(c1.name);
		System.out.println(c1.subject);
		System.out.println(c1.rollNo);
		System.out.println(c1.classId);
		System.out.println("----------------");
		System.out.println(c2.name);
		System.out.println(c2.subject);
		System.out.println(c2.rollNo);
		System.out.println(c2.classId);
	}

}
