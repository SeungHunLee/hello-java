import java.awt.*;
import java.awt.event.*;

class GraphicsEx6 extends Frame {
	Image img = null;

	public GraphicsEx6(String title) {
		super(title);
		addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("getjava.gif");

		setBounds(100,100, 400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GraphicsEx6("GraphicsEx6");
	}
	
	public void paint(Graphics g) {
		if(img==null) return;

		// Image의 크기를 얻는다.
		int imgWidth = img.getWidth(this);   // getWidth(ImageObserver obj)
		int imgHeight = img.getHeight(this); // getHeight(ImageObserver obj)

		// 이미지를 Frame의 중앙에 출력한다.
        g.drawImage(img,(getWidth()-imgWidth)/2, (getHeight()-imgHeight)/2, this);
	}
} // class