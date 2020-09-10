package kr.mycom.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {
	
	public RedDuck() {
		
	}
	
	public RedDuck(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(getX(), getY(), Duck.Duck_Size,Duck.Duck_Size);
	}
};
