import java.awt.*;
import java.awt.event.*;

class ChatWin extends Frame {
	String nickname = "";

	TextArea ta = new TextArea();

	Panel p = new Panel();
	TextField tf = new TextField();

	ChatWin() {
		this("guest");
	}

	ChatWin(String nickname) {
		super("Chatting");
		this.nickname = nickname;

		setBounds(100, 100, 300, 200);

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

		ta.setText("#" + nickname + "´Ô Áñ°Å¿î Ã¤ÆÃµÇ¼¼¿ä.");
		ta.setEditable(false);

		setVisible(true);
		tf.requestFocus();
	}

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java ChatWin NICKNAME");
			System.exit(0);
		}

		new ChatWin(args[0]);
	} // main

	class EventHandler extends FocusAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();
			if("".equals(msg)) return;

			ta.append("\r\n" + nickname +">"+ msg);
			tf.setText("");
		}

		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	} // class EventHandler
} // class