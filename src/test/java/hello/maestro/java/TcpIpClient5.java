package hello.maestro.java;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient5 {

	public static void main(String[] args){
		
		String serverIp = "127.0.0.1";
		
		try {
			Socket socket = new Socket(serverIp, 7777);
			
			System.out.println("서버에 연결되었습니다.");
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch (UnknownHostException e) {
			System.out.println("UnknownHostException !!!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException !!!!");
			e.printStackTrace();
		}
	}
}
