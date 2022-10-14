import java.util.ArrayList;

public class JavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<String>();
		name.add("shweta");
		name.add("sonu");
		name.add("sabu");
		System.out.println(name);
		name.add("raghu");
		System.out.println(name);
		name.add(1,"rohit");
		System.out.println(name);
		name.add(0, "bolo");
		System.out.println(name);
		name.remove(0);
		System.out.println(name);
		name.set(0, "saku");
		System.out.println(name.get(2));
		name.clear();
		System.out.println(name);
	
		
	}

}
