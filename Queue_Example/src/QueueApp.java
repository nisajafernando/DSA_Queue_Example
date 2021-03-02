import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args)
	   {
		
	    QueueX mainQueue = new QueueX(5) ;
	  
		/*mainQueue.insert(1);
		mainQueue.insert(2);
		mainQueue.insert(3);
		mainQueue.insert(4);
		mainQueue.insert(5);*/
	    Scanner sc =new Scanner(System.in);
		
	     int TID ;
	     for(int j=1;j<=5;j++) {
	 	
	 	 System.out.print("Enter transaction ID " +j+ " : ");
	 	 TID = sc.nextInt();
	      mainQueue.insert(TID);
	      }
	     
	     QueueX evenQueue=new QueueX(5);
		 QueueX oddQueue=new QueueX(5);
	     int value;
	     
	     
	     while(!mainQueue.isEmpty()) {
	    	 value = mainQueue.remove();
	    	 if(value % 2 == 0) {
	    		 evenQueue.insert(value);
	    	 }
	    	 else {
	    		 oddQueue.insert(value);
	    	 }
	     } 
	    System.out.println("PC 1");
	   
	    while(!evenQueue.isEmpty()) {
	     System.out.println("Transaction "+ evenQueue.remove());
	     
	    }
	     System.out.println("PC 2");
	     
	     while(!oddQueue.isEmpty()) {
		     System.out.println("Transaction "+ oddQueue.remove());
	     
	   	}
	
	   }        
}
