package string;

public class StringTest {

	public static void main(String[] args) {
		
		/*
		String str1 = new String("abc");
		String str2 = new String("abc");	
		System.out.println(str1 == str2); //같은주소에 있는가?
		//false, 둘은 다른 인스턴스이다
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); //true, 둘은 동일한 메모리, 상수풀
		*/
		
		String str1 = new String("java");
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));
		
		str1 = str1.concat(str2);//두개의 문자열을 연결하면 새로운 인스턴스가 생성됨
		System.out.println(str1);
		
		System.out.println(System.identityHashCode(str1));
		
		
	}

}
