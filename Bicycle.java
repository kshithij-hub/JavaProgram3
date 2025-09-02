package transport;

public class Bicycle extends Vehicle { 
	 
	 public Bicycle(String id) { 
	  super(id); 
	  System.out.println("Bicycle() constructor called"); 
	 } 
	 
	 @Override 
	 public void deliver(String item, String place) { 
		// TODO Auto-generated method stub
	   System.out.println("Deliver " + item + " to " + place + " by Bicycle."); 

	}

}
