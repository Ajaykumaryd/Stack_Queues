package basics;
import java.util.*;
public class Queue {
    
	Stack <Integer>s1;
	Stack <Integer>s2;
	int size;
	
	Queue(){
	s1=new Stack<Integer>();
	s2=new Stack<Integer>();
	size=0;
	}
	
	int getSize() {
		
	return size;	
	}
	void enqueue(int n){			
	s1.push(n);
	size++;
	}
	
	int dequeue() {
	while(!s1.isEmpty()){
	s2.push(s1.pop());
	}
	int ans=s2.pop();
	while(!s2.isEmpty()){
		s1.push(s2.pop());		
	}
	size--;
	return ans;
	}
	
	int top() {
	  while(!s1.isEmpty()){
	  s2.push(s1.pop());
	  }
	  int ans=s2.peek();
	  while(!s2.isEmpty()){
	  s1.push(s2.pop());		
	  }
	  size--;
	  return ans;
	}
				
	public static void main(String[] args) {
	
	Queue q=new Queue();
	
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.enqueue(40);
	System.out.println(q.getSize());    

	
	}

	

}
