package basics;

public class queueArrays {

	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public queueArrays(int capacity){
	data=new int[capacity];
	front=-1;
	rear=-1;
	size=0;	
	}
	
	int size(){
		return size;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	public int front() throws queemptyexception{
		if(size==0){
			throw new queemptyexception();
		}
		return data[front];
	}
	
	void enqueue(int n) throws fullexception
	{
		if(size==data.length){
			throw new fullexception();
		}
		if(size==0){
		   front=0;
		}
		
		rear=(rear+1)%data.length;
		size++;
		data[rear]=n;
	}
	
	int deqeue() throws queemptyexception{
		if(size==0){
			throw new queemptyexception();
		}
	 int temp=data[front]; 
	 
	 front=(front+1)%data.length;
	 size--;
	 
	 if(size==0){
	 front=-1;
	 rear=-1;
	 }
	 
	return temp;
	}
	
	
	public static void main(String[] args) throws fullexception,queemptyexception{
		
			queueArrays queue = new queueArrays(5);
			for(int i = 1; i <= 5; i++)
			{
				queue.enqueue(i);				
			}
			
			while(!queue.isEmpty())
			{				
			System.out.println(queue.deqeue());	
	            }
			  } 	
	       }


