import java.awt.*;

class DialogTest {
	public static void main(String args[]) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);
		
		// parent Frame을 f로 하고, modal을 true로 해서 필수응답 Dialog로 함.
		Dialog info = new Dialog(f, "Information", true);
		info.setSize(140, 90);
		info.setLocation(50, 50);	   // parent Frame이 아닌, 화면이 위치의 기준이 된다.
		info.setLayout(new FlowLayout());

		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");
		info.add(msg);
		info.add(ok);

		f.setVisible(true);
		info.setVisible(true);	// Dialog를 화면에 보이게 한다.
	}
}