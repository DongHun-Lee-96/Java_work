package kr.mycom2.duck;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck{
	
	public DecoyDuck() {
		super();
	}
	
	public DecoyDuck(int x, int y) {
		super(x,y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(getX(), getY(), Duck.DUCK_SIZE, Duck.DUCK_SIZE);
		
	}

	@Override
	public void swim(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawString("¼ö¿µ", getX()-1, getY()-1);
	}
}
