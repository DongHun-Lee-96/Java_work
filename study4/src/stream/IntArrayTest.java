package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
		//한번 생성된 스트림은 재사용이 불가능
		//int count = (int)stream.count();
		//System.out.println(count);
		//아래처럼 생성 다시 해야한다
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
	}

}
