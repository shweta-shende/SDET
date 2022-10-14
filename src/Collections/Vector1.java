package Collections;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> list=new Vector<Object>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add("heloo");
		list.add(null);
		list.add(null);
		list.add(40);
		list.add(66);
		list.add("shweta");
		list.add(7);
		System.out.println(list);
		System.out.println(list.firstElement());
		System.out.println(list.lastElement());
		System.out.println(list.indexOf("heloo"));
		System.out.println(list.capacity());
		list.add(4, "hii");
		System.out.println(list);

	}

}
