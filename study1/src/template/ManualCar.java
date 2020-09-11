package template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("Human drives the car");
		System.out.println("Human controls steering wheel");
	}

	@Override
	public void stop() {
		System.out.println("Human stops the car");
		
	}

	@Override
	public void wiper() {
		System.out.println("Human controls wiper");
		
	}

}