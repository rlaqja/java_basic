package 네트워크프로그램;

import java.net.Socket;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) {
			// TODO Auto-generated method stub
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트 승인 요청 보냄.!!");
		}
		
	}

}
