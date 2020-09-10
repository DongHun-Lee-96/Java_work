import java.util.*;

public class Duck {
	
	protected int x;
	protected int y;
	private String myShape = "Duck";
	
	public Duck() {
		Random rnd = new Random();
		x = rnd.nextInt(800);
		y = rnd.nextInt(600);
	}
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void display() {
		System.out.println(myShape + ":" + "x=" +x+ ", y="+y);
		}
	public void swim() {;}
	public void quack() {;}
};
