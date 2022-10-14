import java.util.LinkedList;

public class JavaCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> name=new LinkedList<String>();
		name.add("saa");
		name.add("mama");
		name.add("chch");
		System.out.println(name);
		name.addFirst("sii");
		System.out.println(name);
		name.addLast("seee");
		System.out.println(name);
		name.add(3, "anish");
		System.out.println(name);
		name.remove();
		System.out.println(name);
		name.removeLast();
		System.out.println(name);
		for(String str:name)
		{
			System.out.println(str);
		}
		
	}

}
