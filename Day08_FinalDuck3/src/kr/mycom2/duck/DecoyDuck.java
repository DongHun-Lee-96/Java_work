package kr.mycom2.duck;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		
	}
	public DecoyDuck(int x, int y) {
		
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(x,y,Duck.DUCK_SIZE,Duck.DUCK_SIZE);
	}

};
