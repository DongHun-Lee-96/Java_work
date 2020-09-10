
public class MallardDuck extends Duck{
	public MallardDuck() {
		super();
	}
	public MallardDuck(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void display() {
		System.out.println("MallardDuck: " + "x="+ x +", y=" + y);
	}
	//Ãß°¡
	public void run() {
		
	}
};
