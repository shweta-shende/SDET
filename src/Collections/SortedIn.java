package Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> set=new TreeSet<>();
		set.add("infosys");
		set.add("ibm");
		set.add("wipro");
		set.add("google");
		set.add("microsoft");
		set.add("capgemini");
		System.out.println(set);
		for(String str:set)
		{
			System.out.println(str);
		}
		System.out.println();
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("infosys"));
		System.out.println(set.tailSet("google"));

	}

}
