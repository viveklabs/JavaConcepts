package oopsConcept1;

public class car extends Vehicle{
	
	public void start() {
		System.out.println("car --- start");
		System.out.println("value of a in car : "+ a);
		System.out.println("value of b in car is: "+ b);
	}
	
	public void stop() {
		System.out.println("car --- stop");
	}
	
	public void refuel() {
		System.out.println("car ---- refuel");
	}

}
