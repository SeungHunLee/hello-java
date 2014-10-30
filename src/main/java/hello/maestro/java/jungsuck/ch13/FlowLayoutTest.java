import java.awt.*;

class FlowLayoutTest {
	public static void main(String args[]) {
		Frame f = new Frame("FlowLayoutTest");
		f.setSize(250, 100);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));  // 왼쪽정렬의 FlowLayout생성

		f.add(new Button("첫 번째"));
		f.add(new Button("두 번째"));
		f.add(new Button("세 번째"));
		f.add(new Button("네 번째"));
		f.add(new Button("다섯 번째"));
		
		f.setVisible(true);
	}
}