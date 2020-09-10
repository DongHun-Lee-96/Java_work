package kr.mycom.gui;

import java.awt.Frame;
import java.awt.Graphics;

import kr.mycom.duck.DuckManager;

public class MyFrame extends Frame{
	
	//클래스변수 = static 변수
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	DuckManager mgr = new DuckManager();
	
	public MyFrame() {
		super(); //부모의 생성자 함수부터 부른다. 외부에서 부르면: new Frame();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setVisible(true);
	}//constructor

	@Override
	public void paint(Graphics g) {
		if(mgr!=null) {
			mgr.displayAllDucks(g);
			mgr.swimAllDucks(g);
			mgr.quackDucks(g);
		}
	}//paint
};
