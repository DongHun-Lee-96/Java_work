package kr.mycom2.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import kr.mycom2.gui.MyFrame;

public abstract class Duck {
	protected int x;
	protected int y;
	public static final int DUCK_SIZE=30;
	
	public Duck() {
		Random rnd = new Random();

		x=rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;  //0~799  ==> 50 ~750
		y=rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70; // 70 ~ 530
	}
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//함수 =메소드 : 머리(원형)부 + 구현부(몸체 { })
	public abstract void display(Graphics g);
	
	public void swim(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("수영", x-1, y-1);
	}

};
