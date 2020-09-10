import java.net.*;
import java.io.*;

public class EchoClientEx {
	String ipAddress;
	int port;
	Socket client = null;
	BufferedReader read;
	
	InputStream is;
	ObjectInputStream ois;
	
	OutputStream os;
	ObjectOutputStream oos;
	
	String sendData;
	String receiveData;
	
	public EchoClientEx(String ip, int p) {
		ipAddress = ip;
		port = p;
		try {
			System.out.println("***Client***");
			client = new Socket(ipAddress, port);
			read = new BufferedReader(new InputStreamReader(System.in));
			os = client.getOutputStream();
			oos = new ObjectOutputStream(os);
			is = client.getInputStream();
			ois = new ObjectInputStream(is);
			
			System.out.print("입력 ->");
			
			while((sendData = read.readLine()) != null) {
				oos.writeObject(sendData);
				oos.flush();
					if(sendData.equals("quit"))
						break;
				receiveData = (String)ois.readObject();
				System.out.println(client.getInetAddress() + "로부터 받은 메세지(에코 됨) " + receiveData );
				System.out.print("입력 -> ");
			}
			ois.close();
			oos.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
			}
		}
	public static void main(String[] args) {
		new EchoClientEx("192.168.0.119", 5000);
	}
};
