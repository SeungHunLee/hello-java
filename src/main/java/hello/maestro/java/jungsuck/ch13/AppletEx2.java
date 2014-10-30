import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class AppletEx2 extends Applet implements MouseMotionListener {
	int x = 0;
	int y = 0;

	Image img = null;
	Graphics gImg = null;

	public AppletEx2() {
		addMouseMotionListener(this);
	}

	public void init() {
		img = createImage(500, 500);
		gImg = img.getGraphics();
		gImg.drawString(getParameter("text") ,10, 50);
		gImg.drawString("value1:"+getParameter("value1") ,10, 65);
		gImg.drawString("value2:"+getParameter("value2") ,10, 80);
	}

	public void paint(Graphics g) {
		if(img==null) return;
		g.drawImage(img,0,0,this);	// 가상화면에 그려진 그림을 Frame에 복사
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

