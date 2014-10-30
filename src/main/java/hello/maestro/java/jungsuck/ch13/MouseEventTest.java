import java.awt.*;
import java.awt.event.*;

class MouseEventTest extends Frame {
	Label location;

	MouseEventTest(String title) {
		super(title); // Frame(String title)을 호출한다.
		location = new Label("Mouse Pointer Location : ");
		location.setSize(195, 15);
		location.setLocation(5,30);
		location.setBackground(Color.yellow);  // Label의 배경색을 노란색으로 한다.
		add(location);

        // EventHandler의 인스턴스를 Frame의 Listener로 등록한다.
		addMouseMotionListener(new EventHandler());

		setSize(300, 200);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		MouseEventTest mainWin = new MouseEventTest("MouseEventTest");
	}     // main메서드의 끝

	class EventHandler implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {}
		public void mouseMoved(MouseEvent e) {
			location.setText("Mouse Pointer Location : (" + e.getX() + ", " + e.getY()+ ")");
		}
	}	// EventHandler클래스의 끝
}