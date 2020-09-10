package kr.mycom2.duck;

import java.awt.Color;
import java.awt.Graphics;


public class MallardDuck extends Duck
		implements Flyable, Quackable{

	public MallardDuck() {
		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x,y);
	}
	
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x,y,Duck.DUCK_SIZE,Duck.DUCK_SIZE);
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("³¯´Ù", x-1, y+Duck.DUCK_SIZE+2);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("²Ð²Ð", x+Duck.DUCK_SIZE, y+1);
	}

};
