
import java.io.*;


public class Main2 {
	public static void main(String[] args) {
		FileInputStream fr = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileOutputStream fw = null;
		OutputStreamWriter osr = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileInputStream("test.txt");
			isr= new InputStreamReader(fr);
			br = new BufferedReader(isr);
			
			fw = new FileOutputStream("test_out3.txt");
			osr = new OutputStreamWriter(fw);
			bw = new BufferedWriter(osr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line+"\n");
			}		

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br!=null)
				try{br.close();} catch (IOException e) {;}
			if(isr!=null)
				try{isr.close();} catch (IOException e) {;}
			if(fr!=null)
				try{fr.close();} catch (IOException e) {;}
			if(bw!=null)
				try{bw.close();} catch (IOException e) {;}
			if(osr!=null)
				try{osr.close();} catch (IOException e) {;}
			if(fw!=null)
				try{fw.close();} catch (IOException e) {;}
		}
	} 
};