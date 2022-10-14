package Collections;

import java.util.LinkedList;

public class Linked1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> list=new LinkedList<Object>();
		list.add(10);
		list.add("hii");
		list.add(null);
		list.add(10);
		list.add(20);
		list.addFirst("byee");
		list.addLast(30);
		System.out.println(list);
		System.out.println(list.getFirst());//get first value
		System.out.println(list.getLast());//get last value
		System.out.println(list.get(1));//get index 1 value
		System.out.println(list.removeFirst());//remove first value
		System.out.println(list.remove(3));//remove index 3
		System.out.println(list.removeLast());//remove last value
		System.out.println(list.removeLastOccurrence(20));
		LinkedList<Object> list2=new LinkedList<Object>();
		list.add(30);
		list.add("hello");
		list.add(10);
		list.add(5);
		list.add(0);
		list.retainAll(list2);//show the duplicates present in list2 w.r.to list1
		System.out.println(list);
		list.removeAll(list2);//remove the duplicates present in list2 w.r.to list1
		System.out.println(list);
		list.addAll(list2);//add all the values to list
		for(Object obj:list)//fetch value present in list 1 by 1
		  {
		System.out.println(obj);
	
	      }
	}
	}


