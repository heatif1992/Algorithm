package lab7;

import java.util.Stack;

public class prob1 {

	public static String reverse(String a) {
		
		Stack<Character> st=new Stack<Character>();
		String r="";
		
		int i=0;
		
		while(i<a.length()) {
			while(i!=a.length() && a.charAt(i)!=' ') {
				st.push(a.charAt(i));
				i++;
			}
			
			while(!st.empty()){
				r=r+(Character)st.pop();
			}
			i++;
			r=r+" ";
		}

		
		return r;
	}
	
	public static void main(String[] args) {

		System.out.println(reverse("houssam eddine atif"));
	}

}
