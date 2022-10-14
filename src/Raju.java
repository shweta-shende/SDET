import java.util.Scanner;

interface Client
{
	void input();
	void output1();
}
public class Raju implements Client{
	String name;
	double sal;
	public void input()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter username: ");
		name=scn.nextLine();
		System.out.println("enter salary ");
		sal=scn.nextDouble();
		
	}
	public void output1()
	{
		System.out.println(name+" "+sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c=new Raju();
		c.input();
		c.output1();
		

	}

	
		
	}


