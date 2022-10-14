package Assignment;

public class Methodoverr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f=new Father();
		f.bike();
		Son s=new Son();
		s.bike();

	}

}
class Father
{
	void bike()
	{
		System.out.println("fathers old bike");
	}
	}
class Son extends Father
{
	@Override
	void bike()
	{
		System.out.println("sons modified new bike");
	}
	}
