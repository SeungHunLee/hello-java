import java.awt.*;

public class HelloApplet extends java.applet.Applet
{
	public void paint(Graphics g) {
		setBackground(Color.lightGray);	// 애플릿의 바탕을 밝은 회색으로 설정
		g.drawString("Hello, Applet.",0,0);
	}
}