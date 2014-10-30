import java.awt.*;

class ChoiceTest {
	public static void main(String args[]) {
		Frame f = new Frame("Choice - Select");
		f.setSize(300, 200);
		f.setLayout(null);

		Choice day = new Choice();	// Choice객체를 생성한 다음
		day.add("SUN");			    // Choice의 목록에 나타날 값들을 추가한다.
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");

		day.setSize(100, 50);
		day.setLocation(100, 70);

		f.add(day);
		f.setVisible(true);
	}
}

