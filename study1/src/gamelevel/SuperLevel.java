package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("Running very fast");

	}

	@Override
	public void jump() {
		System.out.println("jump very high");

	}

	@Override
	public void turn() {
		System.out.println("turn fast");


	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====You are at super level=====");


	}

}
