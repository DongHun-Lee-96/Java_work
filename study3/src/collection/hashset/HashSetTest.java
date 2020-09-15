package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		System.out.println(b1);
		set.add("bbb");
		set.add("ccc");
		System.out.println(set);//순서대로 나오지 않음
		
		boolean b2 = set.add("aaa");//중복입력불가
		System.out.println(b2);
		System.out.println(set);
	}
}
