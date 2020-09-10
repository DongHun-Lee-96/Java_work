package kr.mycom2.duck;

import java.awt.Graphics;

public interface Flyable {
	//멤버변수 선언 불가, 상수는 선언가능
	//int speed = 10; // static final
	public abstract void fly(Graphics g);
};
//일반클래스는 그 틀을가지고 정의하는데 목적

//추상 및 인터페이스 클래스는 자식을 제어하는데 목적