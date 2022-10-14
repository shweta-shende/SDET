package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		set.add(10);
		set.add("hi");
		set.add(20);
		set.add("hello");
		set.add("hello");
		set.add(30);
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.remove(20));
		
		System.out.println(set.size());
		if(set.contains("hi")) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		System.out.println();
		for(Object obj:set) //using for each loop fetching data
		{
			System.out.println(obj);
		}
		Iterator<Object> i=set.iterator();//using iterator fetching data
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
