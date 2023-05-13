package Stacksbasics;
import java.util.*;
public class StackusingQ {
	private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size;

    public StackusingQ() {
       
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
        size = 0;
    }

   
    public int getSize() {
      
        return size;
    }

    public boolean isEmpty() {
       
        return size == 0;
    }

    public void push(int element) {
     
        while(!q1.isEmpty()){        
         q2.add(q1.remove());      
        }
        q1.add(element);
        while(!q2.isEmpty()){
         q1.add(q2.remove());   
        }
        size++;
    }
    
    public int pop() { 
      if (q1.isEmpty())
       {
           return -1;
       }
       size--;     
      return q1.remove();   
    }

    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }
      return q1.peek() ;

    }


	public static void main(String[] args) {
	
    StackusingQ s = new StackusingQ();
    s.push(10);
    s.push(20);
    s.push(30);
    
    System.out.println(s.getSize());
    System.out.println(s.pop());
    
    
    
    
	}

}
