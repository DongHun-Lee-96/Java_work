package generics;

public class Plastic extends Material{
	
	public String toString() {
		return "material is plastic";
	}

	@Override
	public void doPrinting() {
		System.out.println("printing plastic material");
		
	}

}
