package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void washCar() {}

	public void startCar() {
		System.out.println("Start the engine");
	}
	
	public void turnOff() {
		System.out.println("Turning off the engine");
	}
	
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
