package generics;

public class Powder extends Material{
	
	public String toString() {
		return "material is powder";
	}
	
	@Override
	public void doPrinting() {
		System.out.println("printing powder material");
		
	}

}
