
public class Test4 {
	public static void main(String[] args) {
		int score = 88;
		int mock = (int)(score/10);
		
		switch(mock) {
		case 10:
		case 9:
			System.out.println("����: A");
			break;
		case 8:
			System.out.println("����: B");
			break;
		case 7:
			System.out.println("����: C");
			break;
		case 6:
			System.out.println("����: D");
			break;
		default:
			System.out.println("����: F");
		}
	}//main
};
