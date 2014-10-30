import java.awt.*;
import java.awt.event.*;

class GraphicsEx3 extends Frame implements MouseMotionListener {
	int x = 0;
	int y = 0;

	public static void main(String[] args) {
		new GraphicsEx3("GraphicsEx3");
	}
	
	public GraphicsEx3(String title) {
		super(title);
		addMouseMotionListener(this);
		addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	    // Frame을 (100, 100)의 위치에 width 500, height 500 크기로 보이게 한다.
		setBounds(100,100, 500,500);
		setVisible(true);
	}

	public void paint(Graphics g) {
		g.drawString("마우스를 움직여보세요." ,10, 50);
		g.drawString("*", x, y);
	}

	public void update(Graphics g) {
		paint(g);
	}

	public void mouseMoved(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		repaint();
	}

	public void mouseDragged(MouseEvent me) {}
} // class


