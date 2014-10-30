import java.awt.*;

class ColorTest {
	public static void main(String args[]) {
		Frame f = new Frame("Color Test");
		f.setLayout(new GridLayout(14, 2));
		Panel p1 = new Panel();	p1.setBackground(Color.black);
		Panel p2 = new Panel();	p2.setBackground(Color.blue);
		Panel p3 = new Panel();	p3.setBackground(Color.cyan);
		Panel p4 = new Panel();	p4.setBackground(Color.darkGray);
		Panel p5 = new Panel();	p5.setBackground(Color.gray);
		Panel p6 = new Panel();	p6.setBackground(Color.green);
		Panel p7 = new Panel();	p7.setBackground(Color.lightGray);
		Panel p8 = new Panel();	p8.setBackground(Color.magenta);
		Panel p9 = new Panel();	p9.setBackground(Color.orange);
		Panel p10 = new Panel();	p10.setBackground(Color.pink);
		Panel p11 = new Panel();	p11.setBackground(Color.red);
		Panel p12 = new Panel();	p12.setBackground(Color.white);
		Panel p13 = new Panel();	p13.setBackground(Color.yellow);
		Panel p14 = new Panel();      p14.setBackground(new Color(50,100,100));
		f.add(new Label("Color.black"));		f.add(p1);
		f.add(new Label("Color.blue"));			f.add(p2);
		f.add(new Label("Color.cyan"));	        	f.add(p3);
		f.add(new Label("Color.darkGray"));		f.add(p4);
		f.add(new Label("Color.gray"));	         	f.add(p5);
		f.add(new Label("Color.green"));		f.add(p6);
		f.add(new Label("Color.lightGray"));		f.add(p7);
		f.add(new Label("Color.magenta"));		f.add(p8);
		f.add(new Label("Color.orange"));		f.add(p9);
		f.add(new Label("Color.pink"));			f.add(p10);
		f.add(new Label("Color.red"));			f.add(p11);
		f.add(new Label("Color.white"));		f.add(p12);
		f.add(new Label("Color.yellow"));		f.add(p13);
		f.add(new Label("Color(50, 100, 100)"));	f.add(p14);
		f.setSize(250, 300);
		f.setVisible(true);
	}
}