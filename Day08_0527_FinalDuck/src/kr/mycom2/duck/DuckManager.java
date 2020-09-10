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
		int duck_type = 0;
			
		for(int i=0; i<arr.length; i++) {
			duck_type = rnd.nextInt(4); //0,1,2,3
				
			switch(duck_type) {
			case 0:
				arr[i] = new MallardDuck();
				break;
			case 1:
				arr[i] = new RedDuck();
				break;
			case 2:
				arr[i] = new RubberDuck();
				break;
			case 3:
				arr[i] = new DecoyDuck();
				break;
			default:
				arr[i] = new MallardDuck();
				break;
				} //switch
			} //for
		}
	
		public void displayAllDucks(Graphics g) {
			if(arr!=null) {
				for(int i=0; i<arr.length; i++) {
					if(arr[i] != null) {
						arr[i].display(g);
					}
				}
			}
		}
		public void swimAllDucks(Graphics g) {
			if(arr!=null) {
				for(int i=0; i<arr.length; i++) {
					if(arr[i] != null) {
						arr[i].swim(g);
					}
				}
			}
		}
		public void quackAllDucks(Graphics g) {
			if(arr!=null) {
				for(int i=0; i<arr.length; i++) {
					if(arr[i] instanceof Quackable) {
						((Quackable)arr[i]).quack(g);
						} 
			}
		}
		}
		public void flyAllDucks(Graphics g) {
			if(arr!=null) {
				for(int i=0; i<arr.length; i++) {
					if(arr[i] instanceof Flyable) {
						((Flyable)arr[i]).fly(g);
					}
				}
			}
		}
};
