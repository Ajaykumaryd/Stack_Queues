package Stacksquestions;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class q1BalancedParenthesis {
    
	 public static boolean isBalanced(String str) {
	Stack s=new Stack();   
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if((c=='(')||(c=='{')||(c=='[')){
            s.push(c);
        }
       else{
           if(s.isEmpty()){
           return false;
       } 
       else{
            char top=(char)s.peek();
            if((c==')'&& top=='(')||(c=='}'&& top=='{')||(c=='['&& top==']')){
               s.pop();
            }
            else{
                return false;
            }
               } 
            }                               
       }
     if(s.isEmpty()){
         return true;
     }else{
         return false;
     } 
     }
	  
}
	  


