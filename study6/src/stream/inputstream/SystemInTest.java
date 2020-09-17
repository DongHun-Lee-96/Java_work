package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("Insert alphaberts and press Enter");
		int i=0;
		try {
			while((i = System.in.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}