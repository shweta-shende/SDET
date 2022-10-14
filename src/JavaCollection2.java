import java.util.Stack;

public class JavaCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> name=new Stack<>();
		name.add("rahu");
		name.add("ketu");
		name.add("shani");
		System.out.println(name);
		name.push("ravi");
		System.out.println(name);
		name.pop();
		System.out.println(name);
	
	}
}
