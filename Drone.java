package transport;

public class Drone extends Vehicle implements Ipayable {
	public Drone(String id) { 
		super(id);
		System.out.println("Drone constructor() is called");
	}

	@Override
	public void deliver(String item, String place) {
		if(!SecurityRules.canFly(place)) {
			System.out.println("Delivery to " + place + " is blocked  by security");
			return;
		}
		// TODO Auto-generated method stub
		System.out.println("Delivering item " + item + " to place "+ place + " by Drone");
	}
	
	@Override
	public double cost(double distanceKm) {
		return distanceKm*20;
	}
}