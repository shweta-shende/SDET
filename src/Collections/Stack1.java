package Collections;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Object> st=new Stack<Object>();//LIFO
		st.push(20);
		st.push(10);//last in
		System.out.println(st.pop());//10   //First out
		System.out.println(st.pop());//20
		

	}

}
