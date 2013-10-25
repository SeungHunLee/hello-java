package hello.maestro.java;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer4 implements Runnable{

	ServerSocket serverSocket;
	Thread[] threadArr;
	
	public static void main(String args[]){
		
		TcpIpServer4 server = new TcpIpServer4(5);
		server.start();
	}
	
	public TcpIpServer4(int num){
		
		try{
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime()+"서버가 준비되었습니다.");
			
			threadArr = new Thread[num];
			
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void start(){
		for(int i=0; i < threadArr.length; i++){
			threadArr[i] = new Thread(this);
			threadArr[i].start();
		}
	}
	
	@Override
	public void run() {
		
		while(true){
			
			try{
				System.out.println(getTime() + "가 연결요청을 기다립니다.");
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + "데이터를 전송했습니다.");
				
				dos.close();
				socket.close();
				
			}catch(SocketTimeoutException e){
				System.out.println("지정된 시간동안 접속요청이 없어서 서버를 종료합니다.");
				System.exit(0);
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}

	static String getTime(){
		String name = Thread.currentThread().getName();
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss");
		return f.format(new Date()) + name;
	}
}
