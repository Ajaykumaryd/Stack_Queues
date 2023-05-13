package Stacksquestions;
import java.util.* ;
public class q2Redundant {
    
	public static boolean isReduntant(String str) {
	Stack <Character> s=new Stack <Character>();
	int count=0;
	for(int i=0;i<str.length();i++){
	char c=str.charAt(i);
	if(c==')'){
		   
        while(!s.isEmpty() && s.peek()!='('){
			count++;
			s.pop();
		}
		if(count==0||count==1){
			return true;
		}
	    s.pop();
	    count=0;
	}else {
		s.push(c);
	}
	}		
	return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="((a+b))";
    boolean ans=isReduntant(s);
    System.out.println(ans);
	}

}
