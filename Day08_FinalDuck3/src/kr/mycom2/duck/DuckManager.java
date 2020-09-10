package kr.mycom2.duck;

import java.awt.Graphics;
import java.util.Random;

public class DuckManager {

	private Duck[] arr = new Duck[20];
	
	public DuckManager() {
		makeDucks();
	}

	private void makeDucks() {
		Random rnd = new Random();
		int type = 0;
		
		for(int i=0;i<arr.length;i++) {
			type = rnd.nextInt(4); //0,1,2,3
			switch(type) {
			case 0:
				arr[i] = new MallardDuck();//upcasting
				break;
			case 1:
				arr[i] = new RedDuck(); //upcasting
				break;
			case 2:
				arr[i] = new RubberDuck();//upcasting
				break;
			case 3:
				arr[i] = new DecoyDuck();//upcasting
				break;
			default:
				arr[i] = new MallardDuck();
				break;
			}
		}//for
	}
	
	//---일반 메소드 정의
	public void displayAllDucks(Graphics g) {
		if(arr!=null) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i] !=null) {
					arr[i].display(g);
					//upcasting 발생했더라도 override 메소드는 자식것이 호출
				}//if
			}
		}//if
	}
	
	public void swimAllDucks(Graphics g) {
		if(arr!=null) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i] !=null) {
					arr[i].swim(g);
				}//if
			}
		}//if
	}
	
	//-----
	public void quackAllDucks(Graphics g) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Quackable) {
				((Quackable)arr[i]).quack(g);
			}
		}//for
	}

	public void flyAllDucks(Graphics g) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Flyable) {
				((Flyable)arr[i]).fly(g);
			}
		}//for
	}
};
