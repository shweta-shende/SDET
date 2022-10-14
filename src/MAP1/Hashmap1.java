package MAP1;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(10, "hello");//duplicate key is not allowed
		map.put(5, "bye");
		map.put(3, "hello");//duplicate values are allowed
		map.put(null, "abc");//one null key allowed
		map.put(null, "abcd");
		map.put(4, null);
		map.put(2, null);
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.replace(5, "super"));
		System.out.println(map.get(10));
		System.out.println(map);
		for(java.util.Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
