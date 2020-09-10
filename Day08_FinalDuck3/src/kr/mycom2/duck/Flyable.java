package kr.mycom2.duck;

import java.awt.Graphics;

public interface Flyable {
	//멤버변수선언불가,상수는 선언가능
	int speed =10;  //static final
	public abstract void fly(Graphics g);
};
