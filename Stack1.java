import java.util.*;
class Stack1{
	public static void main(String args[]){
		Stack<Integer> st=new Stack<>();
		st.push(4);
		st.push(5);
		st.pop();
		
		System.out.println(st+"   "+st.peek());
	}
}