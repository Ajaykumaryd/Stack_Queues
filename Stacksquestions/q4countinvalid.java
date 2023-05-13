package Stacksquestions;
import java.util.*;
public class q4countinvalid {
	public static int countBracketReversals(String input) {
		
		if(input.length()%2!=0){
			return -1;
		}	
		Stack <Character> s=new Stack <Character>();
	     
		 for(int i=0;i<input.length();i++){
	         char c=input.charAt(i);
			 if(c=='{'){
				 s.push(c);
			 }	
	         else{
				     if(!s.isEmpty() && s.peek()=='{'){
						 s.pop();
					 }else{
						 s.push(c);
					 }
			 } }
	      int a=0,b=0;
	         
	      while(!s.isEmpty()){
			  if(s.peek()=='}'){
				  a++;
			  }
			  else{
				  b++;
			  }
			  s.pop();
		  }
		 int ans=(((a+1)/2)+((b+1)/2));
		 return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="{{{{";
    System.out.println(countBracketReversals(s));
	}

}
