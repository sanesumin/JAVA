package ServerChat;

import java.io.*;
import java.net.*;

class SendThread extends Thread{
	Socket socket;
	
	SendThread(Socket socket){
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			
			PrintWriter writer = 
					new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String str = reader.readLine();
				if(str.equals("BYE"))
					break;
				
				writer.println(str);
				writer.flush();
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				System.out.println("****ä�ù��� �����ϴ�.****");
				socket.close();
			}catch(Exception e) {}
		}
	}
}
