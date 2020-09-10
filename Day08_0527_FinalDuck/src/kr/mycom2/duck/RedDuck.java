package kr.mycom2.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck
implements Flyable, Quackable {
		
		public RedDuck() {
			super();
		}
		
		public RedDuck(int x, int y) {
			super(x,y);
		}

		@Override
		public void display(Graphics g) {
			g.setColor(Color.RED);
			g.fillOval(getX(), getY(), Duck.DUCK_SIZE, Duck.DUCK_SIZE);
		}

		@Override
		public void quack(Graphics g) {
			g.setColor(Color.RED);
			g.drawString("²Ð²Ð", getX()+Duck.DUCK_SIZE, getY()-1);
		}

		@Override
		public void fly(Graphics g) {
			g.setColor(Color.RED);
			g.drawString("³¯´Ù", getX()-1, getY()+Duck.DUCK_SIZE);
		}

		@Override
		public void swim(Graphics g) {
			g.setColor(Color.RED);
			g.drawString("¼ö¿µ", getX()-1, getY()-1);
		}
};
