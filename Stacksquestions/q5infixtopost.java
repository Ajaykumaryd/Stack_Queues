package Stacksquestions;
import java.util.*;
public class q5infixtopost {
	
	static int precedence (char c) {
		if (c == '^') {
			return 3;
	    }
		else if (c == '/' || c == '*') {
			return 2;
	    }
		else if (c == '+' || c == '-') {
			return 1;
	    }
		else {
	        return 0;
	    }
	}
	static boolean isOperand (char c) {
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
			return true;
		}
		return false;
	}
	
	static String infixToPostfix (String exp) {
	    String postFix = new String("");
	    Stack<Character> st = new Stack<>();
	    for (int i = 0; i<exp.length(); ++i) {
	        char c = exp.charAt(i);
	        if (isOperand(c)){
	            postFix += c;
	        }
	        else if (c == '(') {
	            st.push(c);
	        }
	        else if (c == ')') {
	            while (!st.isEmpty() && st.peek() != '('){
	                postFix += st.pop();	                
	            }
	            st.pop();
	        }
	        else {
	            while (!st.isEmpty() && precedence(c) <= precedence(st.peek())){
	                postFix += st.pop();
	            }
	            st.push(c);
	        }
	    }

	    while (!st.isEmpty()) {
	        postFix += st.pop();
	    }

	    return postFix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s= "a+b*(d+e)";
     String ans=infixToPostfix (s);
     System.out.println(ans);
	
	}

}
