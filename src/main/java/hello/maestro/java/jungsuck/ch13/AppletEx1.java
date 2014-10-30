import java.awt.*;
import java.awt.event.*;

public class AppletEx1 extends java.applet.Applet
{
	TextArea ta = new TextArea();
	Button clear = new Button("clear");

	public AppletEx1() {
		setLayout(new BorderLayout());
		add(ta,"Center");
		add(clear,"South");

		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		write("constructor\n");
	}

	public void init() {	write("init()\n");	}
	public void start() {	write("start()\n");	}
	public void stop() {	write("stop()\n");	}
	public void destroy() { write("destroy()\n");	}
	public void paint(Graphics g) {	write("paint()\n");	}
	public void write(String str) {
		ta.append(str);
		System.out.print(str);
	}
}