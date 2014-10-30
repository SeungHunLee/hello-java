import java.awt.*;
import java.awt.event.*;

class GraphicsEx5 extends Frame implements MouseMotionListener {
	int x = 0;
	int y = 0;

	Image img = null;
	Graphics gImg = null;

	public static void main(String[] args) {
		new GraphicsEx5("GraphicsEx5");
	}
	
	public GraphicsEx5(String title) {
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

		img = createImage(500, 500);
		gImg = img.getGraphics();
		gImg.drawString("왼쪽버튼을 누른 채로 마우스를 움직여보세요." ,10, 50);
		repaint();
	}

	public void paint(Graphics g) {
		if(img==null) return;
		g.drawImage(img,0,0,this); 	// 가상화면에 그려진 그림을 Frame에 복사
	}

	public void mouseMoved(MouseEvent me) {
		x = me.getX();
		y = me.getY();
	}
	public void mouseDragged(MouseEvent me) {
		if (me.getModifiersEx()!=MouseEvent.BUTTON1_DOWN_MASK ) return;

		gImg.drawLine(x,y, me.getX(),me.getY());
		x = me.getX();
		y = me.getY();

		repaint();
	}
} // class