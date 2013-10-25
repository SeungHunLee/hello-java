package hello.maestro.java;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {

	public void start() throws IOException{
		
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket, outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		while(true){
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			
			socket.receive(inPacket);
			
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes();
			
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
			socket.send(outPacket);			
		}		
	}
	
	public static void main(String args[]){
		try{
			new UdpServer().start();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}








