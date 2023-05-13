package Stacksbasics;
import java.util.Stack;
public class StackCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack s=new Stack();
     int a[]= {1,2,3,4,5};
     for(int i=0;i<a.length;i++){
    	 s.push(a[i]);
     }
    // System.out.println(s.peek());
     while(!s.isEmpty()){
         System.out.println(s.peek());
         s.pop();
	}
    //import java.util.Stack;
//     class Test {
//    	    public static void main (String[] args) {
//    	        Stack<Integer> stack=new Stack<Integer>();
//    	        stack.push(5);
//    	        stack.push(10);
//    	        stack.push(15);
//    	        System.out.print(stack.pop()+stack.size());
//    	    }
//    	}
//ans 17

//     class Test {
//    	    public static void main (String[] args) {
//    	        Stack<Integer> stack=new Stack<Integer>();
//    	        for(int i=0;i<10;i++)
//    	        {
//    	            stack.push(i*2);
//    	        }
//    	        System.out.print(stack.peek());
//    	    }
//    	}
//ans 18     
}
}