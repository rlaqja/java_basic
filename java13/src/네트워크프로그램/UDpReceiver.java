package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDpReceiver {

	public static void main(String[] args) throws Exception {
		//1.받는 소켓이 있어야 함.
		DatagramSocket socket= new DatagramSocket(8888);
		//2.패킷으로 보냈기 때문에 빈 패킷을 만들어두면,
		// 	빈 패킷안에는 빈 byte[]가 있어야 함.
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("받을 준비중...");
		//3.소켓이 받아서 빈 패킷에 넣는다.
		socket.receive(packet);
		//4.byte[]를 String으로 변경.
		System.out.println(data.length);
		System.out.println("받은 데이터는"+new String(data));
		
		socket.close();
	}

}
