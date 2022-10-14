
public class Variable {
	
	int a=10; //instance
	static int b=23;//static

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=11; //local
		Variable v=new Variable();
		System.out.println("static variable "+Variable.b);
		System.out.println("local variable "+c);
		System.out.println("instance variable "+v.a);
	}

}
