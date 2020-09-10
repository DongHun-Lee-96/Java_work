import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck{
	public MallardDuck() {
		super();
	}
	public MallardDuck(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(new Color(0,0,255));
		g.fillOval(x, y, 50, 50);
	}
};
