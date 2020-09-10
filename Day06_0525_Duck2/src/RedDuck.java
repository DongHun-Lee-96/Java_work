
public class RedDuck extends Duck {
	public RedDuck() {
		super();
	}
	public RedDuck(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void display() {
		System.out.println("RedDuck: " + "x="+ x +", y=" + y);
	}
};
