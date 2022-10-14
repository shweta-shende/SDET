package Collections;

import java.util.ArrayList;
import java.util.Collections;



public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list=new ArrayList<Object>();
	list.add(10);
	list.add(20);
	list.add(10);
	list.add("hi");
	list.add(null);
	list.add(null);
	System.out.println(list);
	list.add(2, "hello");
	System.out.println(list);
	ArrayList<Integer> list2=new ArrayList<Integer>();
	list2.add(20);
	list2.add(5);
	list2.add(1);
	list2.add(30);
	list.addAll(list2);
	Collections.sort(list2);//used to sort the element
	System.out.println(list2);
	list.addAll(list2);//used to add list2 to list
	System.out.println(list);
	if(list.contains("hi"))//used to check object present or not
			{
		System.out.println("is present");
			}
	else {
		System.out.println("not present");
	}
	System.out.println(list.remove(1));//will remove the element present in index1
	for(Object obj: list)//used to fetch elements 1 by 1 using for-each loop
	{
		System.out.println(obj);
	}
	
	

	

}
}
