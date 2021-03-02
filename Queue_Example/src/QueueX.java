public class QueueX {
	
    private int[] queueArr;
    private int maxSize;
    private int rear;
    private int front;
    private int noItems;
	
    public QueueX(int s) {
    	maxSize=s;
    	queueArr = new int[maxSize];
    	front=0;
    	rear=-1;
    	noItems=0;
    	
    }
    
    public void insert(int j) {
    	if(maxSize-1==rear) {
    		System.out.println("Queue is full");
    		
    	}
    	else {//if queue is not full 
    		queueArr[++rear]=j;
    		noItems++;
    	}
    }
	
    public int remove() {
    	if (noItems==0) {
    		System.out.println("Queue is empty");
    		return -99;
    		}
    	else { 
    		noItems--;
    		return(queueArr[front++]);
    	}
    }
    
    public boolean isFull(){
    	return (maxSize-1==rear);
    	}
    
    public boolean isEmpty() {
    	return (noItems==0);
    	}
    }

