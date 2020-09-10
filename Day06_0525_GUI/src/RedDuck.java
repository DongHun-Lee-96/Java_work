import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck{
	public RedDuck() {
		super();
	}
	public RedDuck(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(new Color(255,0,0));
		g.fillOval(x, y, 50, 50);
	}
}
