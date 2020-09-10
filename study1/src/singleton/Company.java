package singleton;

public class Company {
	
	private static Company instance = new Company();
	
	//private constructor
	private Company() {}
	
	public static Company getInstance() {
		return instance;
	}
}
