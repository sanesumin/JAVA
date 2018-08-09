package chat;

import java.net.*;

class ClientChatTest {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1",7050);
			
			System.out.println("*****ä�ù濡 ���Խ��ϴ�.*****");
			
			SendThread st = new SendThread(socket);
			
			ReceiveThread rt = new ReceiveThread(socket);
			
			st.start();
			
			rt.start();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
