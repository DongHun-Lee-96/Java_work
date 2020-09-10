
public class Test5 {
	
	static int max(int x, int y) {
		
		int result = x;
		if(result<y) {
			result = y;
		}
		return result;
	}
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int maxValue = max(a,b);
		System.out.println(maxValue);
		
		int a1 = 30;
		int b1 = 40;
		int maxValue2 = max(a1,b1);
		System.out.println(maxValue2);
		
	}//main
		
};
