package oopsConcept1;

public class TestCar {

	public static void main(String[] args) {
		

		BMW b = new BMW(); // static polymorphism or compile time polymorphism
		
		b.start();  // method overriding
		b.stop();
		b.refuel();
		b.safety();
		
		System.out.println("***************************************");
		
		car c = new car();
		c.start();
		c.stop();
		c.refuel();
		c.engine(); // parent class method
		
		System.out.println("***************************************");
		
		// top casting
		car c1 = new BMW(); // dynamic polymorphism or run time polymorphism
		// in dynamic polymorphism only overridden and parent class method will be called
		c1.engine();
		c1.start(); // overridden method
		c1.stop();
		c1.refuel();
		//c1.safety();  - not possible
		
		// down casting - it is not possible as it will throw ClassCastException
		//BMW b2 = (BMW) new car();
		
		
		
		
		
		

	}

}
