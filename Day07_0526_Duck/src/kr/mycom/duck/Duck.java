package kr.mycom.duck;

import java.awt.Graphics;
import java.util.Random;
import kr.mycom.gui.MyFrame;

public abstract class Duck {
	private int x;
	private int y;
	public static final int Duck_Size = 50;
	
	public Duck() {
		Random rnd = new Random();
		x=rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;
		y=rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
	}
	//Method Overloading
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// ÇÔ¼ö = ¸Þ¼Òµå: ¸Ó¸®(¿øÇü)ºÎ + ±¸ÇöºÎ(¸öÃÇ{})
	public abstract void display(Graphics g);
	
	public void swim(Graphics g) {
		g.drawString("¼ö¿µ", x-1, y-1);
	}
	
	public void quack(Graphics g) {
		g.drawString("²Ð²Ð", x+Duck_Size, y-1);
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		if(x>50 && x<750) {
			this.x = x;
		}
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
};
