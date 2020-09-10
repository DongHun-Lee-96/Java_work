
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");
			FileWriter fw = new FileWriter("test_out.txt");
			
			if(fr != null) {
				int ch;
				while((ch = fr.read()) != -1) {
					System.out.print((char)ch);
					fw.write((char)ch);
				}
			}//if 
			fr.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("해당경로에 파일이 없음");
		} catch (IOException e) {
			System.out.println("더이상 읽을 내용이 없음");
		}
	} 
};
