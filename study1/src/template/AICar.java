package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("Auto Driving");
		System.out.println("Car automatically changes direction");
		
	}

	@Override
	public void stop() {
		System.out.println("Car automatically stops");
		
	}

	@Override
	public void wiper() {
		System.out.println("Automatically controls wiper");
		
	}
	
	@Override
	public void washCar() {
		System.out.println("Automatically washs the car");
	}

}