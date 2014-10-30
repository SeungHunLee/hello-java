import java.awt.*;
import java.awt.event.*;

class CheckboxEventTest extends Frame {
	Label q1;
	Label q2;
	Label score;
	Checkbox q1cb1, q1cb2, q1cb3, q1cb4;
	Checkbox q2cb1, q2cb2, q2cb3, q2cb4;
	CheckboxGroup group;
	Button end;

	CheckboxEventTest(String title) {
		super(title); // Frame(String title)을 호출한다.
		setSize(500, 300);
		setLayout(new GridLayout(13,1));

		q1 = new Label("1. 다음 중 ActionEvent의 actionPerformed메서드가 호출되는 경우는? (모두 고르세요.)");
		q1cb1 = new Checkbox("Button을 눌렀을 때");
		q1cb2 = new Checkbox("TextField에서 Enter키를 눌렀을 때");
		q1cb3 = new Checkbox("MenuItem을 클릭했을 때");
		q1cb4 = new Checkbox("List에서 더블클릭으로 item을 선택했을 때");

		q2 = new Label("2. Frame의 기본 LayoutManager는? (하나만 고르세요.)");
		group = new CheckboxGroup();
		q2cb1 = new Checkbox("FlowLayout", group, false); 
		q2cb2 = new Checkbox("GridLayout", group, false); 
		q2cb3 = new Checkbox("BorderLayout", group, false); 
		q2cb4 = new Checkbox("CardLayout", group, false); 
		
		score = new Label("* 결과 :");
		end = new Button("이 버튼을 누르시면 결과를 알수 있습니다.");
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float totalScore=0;
				if(q1cb1.getState())	totalScore += 12.5;
				if(q1cb2.getState())	totalScore += 12.5;
				if(q1cb3.getState())	totalScore += 12.5;
				if(q1cb4.getState())	totalScore += 12.5;
				if(q2cb3.getState())	totalScore += 50;
				score.setText("* 결과 : 당신의 점수는 " + totalScore + "점 입니다.");
			}
		});

		add(q1);
		add(q1cb1);	add(q1cb2);	add(q1cb3);	add(q1cb4);
		add(new Label("")); // 문제들 사이에 빈 줄을 하나 삽입하기 위해 사용
		add(q2);
		add(q2cb1);	add(q2cb2);	add(q2cb3);	add(q2cb4);
		add(end);
		add(score);

		setVisible(true);
	}

	public static void main(String args[]) {
		CheckboxEventTest mainWin = new CheckboxEventTest("CheckboxEventTest - Quiz");
	}       // main메서드의 끝
}