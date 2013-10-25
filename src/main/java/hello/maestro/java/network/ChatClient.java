package hello.maestro.java.network;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

/**
 * 출처 : Java의 정석, Chapter 15 네트워킹(Networking)
 * */
class ChatClient extends Frame {
	String nickname = "";
	String serverIp = "";
	int serverPort = 0;

	DataOutputStream out;
	DataInputStream in;

	Panel p = new Panel();
	TextArea ta = new TextArea();
	TextField tf = new TextField();

	ChatClient(String nickname, String serverIp, String serverPort) {
		super("Chatting with " + serverIp +":" + serverPort);
		this.nickname = nickname;
		this.serverIp = serverIp;
		this.serverPort = Integer.parseInt(serverPort);

		setBounds(600, 200, 300, 200);

		p.setLayout(new BorderLayout());
		p.add(tf, "Center");

		add(ta, "Center");
		add(p, "South");

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);

		ta.setEditable(false);

		setVisible(true);
		tf.requestFocus();
	}

	void startClient() {
/*		try {
			
				(3) 아래의 로직에 맞게 코드를 작성하시오.
				1. 소켓을 생성하여 serverIp의 serverPort에 연결한다.
				2. ta에 "상대방과 연결되었습니다."라고 보여준다.
				3. 연결된 상대방 소켓의 입력스트림과 출력스트립을 얻어온다.
				4. 반복문을 이용해서 입력스트림이 null이 아닌 동안
				    입력스트림으로부터 데이터를 읽어서 ta에 append한다.
			
		} catch(ConnectException ce) {
			ta.setText("상대방과 연결할 수 없습니다.");
			ce.printStackTrace();
		} catch(IOException ie) {  
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();  
		}  */
	}

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("USAGE : java ChatClient NICKNAME SERVER_IP SERVER_PORT");
			System.exit(0);
		}

		ChatClient chatWin = new ChatClient(args[0],args[1],args[2]);
		chatWin.startClient();
	} // main

	class EventHandler extends FocusAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();

			if("".equals(msg)) return;
			/*
				(4) 알맞은 코드를 넣어 완성하시오.
			*/
			ta.append("\r\n" + nickname +">"+ msg);
			tf.setText("");
		}

		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	} // class EventHandler
} // class