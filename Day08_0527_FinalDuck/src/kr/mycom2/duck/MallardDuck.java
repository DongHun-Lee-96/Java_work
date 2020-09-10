package kr.mycom2.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck 
implements Flyable, Quackable {
	
	public MallardDuck() {
		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x,y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(getX(), getY(), Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("²Ð²Ð", getX()+Duck.DUCK_SIZE, getY()-1);
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("³¯´Ù", getX()-1, getY()+Duck.DUCK_SIZE);
		
	}

	@Override
	public void swim(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("¼ö¿µ", getX()-1, getY()-1);
	}
};
