
public class Test {
	public static void main(String[] args) {
		char c = 'A'; //'A' = 65, 'a' = 97
		
		switch(c) {
		case 'A':
			System.out.println("A");
			break;
		default:
			System.out.println("Not A");
		}// switch
		
		//---string
		String str = "Hello";
		
		switch(str) {
		case "World":
		case "Hello":
		case "":
			System.out.println("correct");
			break;
		}
		
	}//main
};
