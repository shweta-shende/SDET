package MAP1;

import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(10, "hello");//duplicate key is not allowed
		map.put(5, "bye");
		map.put(3, "hello");//duplicate values are allowed
		//map.put(null, "abc");//one null key not allowed
		//map.put(null, "abcd");
		map.put(4, null);//allowed
		map.put(2, null);//allowed
		System.out.println(map);
		

	}

}
