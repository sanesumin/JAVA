package ServerChat;

import java.net.*;

class ServerChatTest {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7050);
			System.out.println("ä�ù��� ���Ƚ��ϴ�.");
			
			socket = serverSocket.accept();
			System.out.println("������ �����߽��ϴ�.");
			
			SendThread st = new SendThread(socket);
			
			ReceiveThread rt = new ReceiveThread(socket);
			
			st.start();
			
			rt.start();
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				serverSocket.close();
			}catch(Exception e) {
				
			}
		}
	}
}
