package kr.mycom2.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck
implements Quackable{
	
	public RubberDuck() {
		super();
	}

	public RubberDuck(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void quack(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawString("»à»à", getX()+Duck.DUCK_SIZE, getY()-1);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(getX(), getY(), Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

	@Override
	public void swim(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawString("¼ö¿µ", getX()-1, getY()-1);
	}

}
