package transport;

public class EBike extends Bicycle { 
	
	  private int battery; 
	 
	   public EBike(String id,int battery) { 
	  super(id); 
	  this.battery=battery; 
	  System.out.println("Ebike() constructor called");
	  // TODO Auto-generated constructor stub 
	  } 
	 
	 
	 
	     @Override 
	     public void deliver(String item, String place) { 
	     System.out.println("check battery:" + battery+" %"); 
	    super.deliver(item,place); 
	 } 
	  
}

