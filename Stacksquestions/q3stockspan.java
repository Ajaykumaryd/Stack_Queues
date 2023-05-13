package Stacksquestions;
import java.util.*;
public class q3stockspan {
	public static int[] stockSpan(int[] price) {
		
		int span[]=new int[price.length];
		Stack <Integer>s=new Stack<Integer>();	
		span[0]=1;
		s.push(0);
		for(int i=1;i<price.length;i++){
			while(!s.isEmpty()&& price[s.peek()]<price[i]){
				s.pop();
			}
			if(s.isEmpty()){
				span[i]=i+1;
			  }
			else
			  {
				span[i]=i-s.peek();
			}
			s.push(i);
		}
		return span;
	}
	public static void main(String[] args) {
		

	}

}
