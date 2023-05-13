package Stacksbasics;

public class StackLL {
	
		
		private Node head;	
		private int size;	
			
		StackLL(){
		head=null;
		size=0;
		}
		
		public int size() {
			return size;
		}
		
		public boolean isempty(){
			return (size()==0);
		}
		
		public int top() throws stackemptyexception{
		if(size()==0){
			throw new stackemptyexception();
		}
		return head.data;	
		}	
		 	
		public void push(int n){
		Node newNode=new Node(n); 	
		newNode.next=head;
		head=newNode;
		size++;	
		}
		
		public int pop() throws stackemptyexception{
	    
		if(size()==0){
		throw new stackemptyexception();	
		}
		int tempdata=head.data;
		head=head.next;
		size--;
		return tempdata;	
		}
		
				
		public static void main(String[] args) throws stackemptyexception {
			
		StackLL s=new StackLL();	
			
		for(int i=0;i<4;i++){	
		s.push(i);				
		}	
			
        s.push(7);
        s.pop();
		System.out.println(s.top());
		System.out.println(s.size());
		System.out.println(s.isempty());	
			
			
			
		}		
      }
