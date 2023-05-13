package Stacksbasics;

public class StacksArray {

	private int data[];
	private int top;
	
    public StacksArray (int capacity){	
	data=new int[capacity];
	top=-1;
    }
    
    public boolean isEmpty()
    {
     return(top==-1); 	
    }
	
	public int size() {
	return top+1;
	}
	
	public int top() throws stackemptyexception{
	
	if(size()==0){
		stackemptyexception e=new stackemptyexception();
		throw e;
	}
	return data[top];
	}
		
	public void push(int n) throws stackfullexception{
	
//	if(size()==data.length){
//	stackfullexception e =new stackfullexception();
//	throw e;	
	//}
	if(size()==data.length){
		doublecapacity();
	}
	top++;
	data[top]=n;			
	}	
	
	public void doublecapacity(){
	int temp[]=data;
    data=new int [2*data.length];
    for(int i=0;i<=top;i++){
    	data[i]=temp[i];   	
    }
	}
	
	public int pop() throws stackemptyexception{

		if(size()==0){ 
		   stackemptyexception e=new stackemptyexception();
		   throw e;
		}
		int temp=data[top];
		top--;
		return temp;		
	}
			
	public static void main(String[] args) throws stackfullexception,stackemptyexception {
	
	StacksArray s=new StacksArray(3);
	
	for(int i=0;i<4;i++){
	s.push(i);	
	}
	
	s.push(4);
	s.push(2);
	s.push(1);
	s.push(1);
	s.push(7);
	s.push(7);
	s.pop();
	s.pop();
	s.top();
	s.isEmpty();
	
	System.out.println(s.size());
	System.out.println(s.top());
	System.out.println(s.isEmpty());
//	System.out.println(s.top());
	
	}		
}
