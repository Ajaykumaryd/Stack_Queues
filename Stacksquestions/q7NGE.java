package Stacksquestions;
import java.util.*;
public class q7NGE {

	public static int[] NGE(int a[]){
	
	int n=a.length;
	int ans[]=new int[n];		
	Stack<Integer> s=new Stack<>();	
	ans[n-1]=-1;
	
	s.push(a[n-1]);	
	for(int i=a.length-2;i>=0;i--){	
		
		while(!s.isEmpty() && a[i]>=s.peek()){
			s.pop();			
		}
		
		if(s.isEmpty()){
		   ans[i]=-1;
		}
		 else
		     {
			  ans[i]=s.peek();
		     }      			
			s.push(a[i]);
		}
	return ans;
	}	
	public static void print(int a[]){
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");			        
	   }	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {2,5,9,5,1,12,6,8,7};
    int ans[]=NGE(a);
    print(ans);    
	}

}
