import java.awt.*;

class ButtonTest {
	public static void main(String args[]) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);

		Button b = new Button("확 인");  // Button위에 "확 인"이라는 글자가 나타난다.
		b.setSize(100, 50);				 // Button의 크기를 설정한다.

		f.add(b);				     // 생성된 Button을 Frame에 포함시킨다.
		f.setVisible(true);
	}
}