package gamelevel;

public class AdvancedLevel extends PlayerLevel{
	
	@Override
	public void run() {
		System.out.println("Running fast");

	}

	@Override
	public void jump() {
		System.out.println("jump high");

	}

	@Override
	public void turn() {
		System.out.println("Cannot turn");


	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====You are at advanced level=====");


	}

}
