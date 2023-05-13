package basics;

public class qLL {
     
	Node front;
	Node rear;
	int size;
   

	public qLL() 
	{
		front=null;
		rear=null;
		size=0;		
	}

	public int getSize() { 
		return size;
	    }

	    public boolean isEmpty() { 		
	    return (size==0);
	    }


	    public void enqueue(int data) {
		Node newNode=new Node(data);	
	    if(rear==null)
		{
		   front=newNode;
		   rear=newNode;	 
		}
	     else{
			  rear.next=newNode;
			  rear=newNode;
		 }
	     size++;
	    }


	    public int dequeue() {
		
		if(front==null){
			return -1;
		}

	    int temp=front.data;
		front=front.next;
		if(size==1){
	    rear=null; 
		}	
		size--;
		return temp;
	    }


	    public int front() {
		if(front==null){
			return -1;
		}	
	    
	    return front.data;

	    }
	

	public static void main(String[] args) {
	
	qLL q=new qLL();	
	
	for(int i=1;i<=5;i++) {
	q.enqueue(i);	
	}
    
	while(!q.isEmpty()){
	System.out.print(q.dequeue());
	
	}
  }   
}
