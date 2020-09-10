package kr.mycom2.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import kr.mycom2.gui.MyFrame;

public abstract class Duck {
	private int x;
	private int y;
	public static final int DUCK_SIZE = 50;
	
	public Duck() {
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
	}
	
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void display(Graphics g);
	
	public abstract void swim(Graphics g);
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		if(x>50 && x < 750) {
			this.x = x;
		}
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		if(y>70 && y<530) {
			this.y = y;
		}
	}
};
