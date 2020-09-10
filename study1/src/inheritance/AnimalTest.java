package inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("Animal is moving");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("Human is walking with two feet");
	}
	
	public void readBook() {
		System.out.println("Human is reading a book");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("Tiger is running with four feet");
	}
	
	public void hunting() {
		System.out.println("Tigher is hunting a prey");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("Eagle is flying");
	}
	
	public void flying () {
		System.out.println("flies");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		//Animal animal = new Human(); 
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		

	}
	
	public void moveAnimal(Animal animal) {
		
		animal.move();
		
		// Animal 타입으로 업캐스팅이 되면 자식클래스가 가지고 있는 메서드는 보이지 않는다
		// 자식 클래스가 가진 메서드를 실행시키고 있으면 다시 다운캐스팅이 필용하다
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else {
			System.out.println("not supporting");
		}
	}
}
