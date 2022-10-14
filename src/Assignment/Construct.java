package Assignment;

public class Construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct c=new Construct("shweta",888888888,'F');
		c.disp();

	}
	String name;
	long mobNo;
	char gender;
	Construct(String s,long l,char c)
	
	{
		this.name=s;
		this.mobNo=l;
		this.gender=c;
	}
	void disp()
	{
		System.out.println("Name is = "+name);
		System.out.println("mobile number = "+mobNo);
		System.out.println("Gender is = "+gender);
	}
	

}
