package kr.mycom2.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck 
			implements Quackable{

	public RubberDuck() {
		super();
	}
	public RubberDuck(int x, int y) {
		super(x,y);
	}
	@Override
	public void quack(Graphics g) {
		g.setColor(Color.ORANGE);
		g.drawString("»à»à", x+Duck.DUCK_SIZE, y+1);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(x,y,Duck.DUCK_SIZE,Duck.DUCK_SIZE);
	}

};
