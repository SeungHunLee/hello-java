import java.awt.*;

class ScrollbarTest {
	public static void main(String args[]) {
		Frame f = new Frame("Scrollbar");
		f.setSize(300, 200);
		f.setLayout(null);

		Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0, 100);
		hor.setSize(100, 15);
		hor.setLocation(60, 30);
		Scrollbar ver = new Scrollbar(Scrollbar.VERTICAL, 50, 20, 0, 100);
		ver.setSize(15, 100);
		ver.setLocation(30, 30);

		f.add(hor);
		f.add(ver);
		f.setVisible(true);
	}
}