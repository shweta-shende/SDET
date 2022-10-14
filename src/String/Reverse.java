package String;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="abcdefgh";
		String reverse=new StringBuffer(string).reverse().toString();
		System.out.println("before reverse "+string);
		System.out.println("after reverse "+reverse);

	}

}
