package hello.maestro.java.network;

import java.net.*;
import java.io.*;
import java.awt.*; 
import java.awt.event.*; 

/**
 * 출처 : Java의 정석, Chapter 15 네트워킹(Networking)
 * */
class SourceViewer extends Frame 
{
	TextField tf = new TextField();
	TextArea  ta = new TextArea();

	SourceViewer(String title) { 
		super(title); 

		add(tf, "North");
		add(ta, "Center");

		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				displaySource();
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		setBounds(500, 200, 500, 300); 
		setVisible(true); 
	}

	void displaySource() {
		URL url = null;
		BufferedReader input = null;
		String address = tf.getText().trim();
		String line = "";

		ta.setText("");

		try {
			if(!address.startsWith("http://"))
				address = "http://"+address;

			/*
				(1) 알맞은 코드를 넣어 완성하시오.
			*/
			input.close();
		} catch(Exception e) {
			ta.setText("유효하지 않은 URL입니다.");
		}
	} // displaySource()
	
	public static void main(String[] args) {
		SourceViewer mainWin = new SourceViewer("Source Viewer");
	}
}

