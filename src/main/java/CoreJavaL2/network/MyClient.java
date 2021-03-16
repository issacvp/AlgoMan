package CoreJavaL2.network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {

	public static void main (String args[]) {
		try {
			Socket s = new Socket("127.0.0.1",6666);
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str="", str2="";
			while(!str.equals("stop")){
				str2 = br.readLine();
				dout.writeUTF(str2);
				str = dis.readUTF();
				System.err.println("server says :"+str);
				dout.flush();
			}
			dis.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}
