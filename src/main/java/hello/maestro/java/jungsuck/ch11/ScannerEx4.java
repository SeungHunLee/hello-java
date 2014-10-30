import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

class ScannerEx4 {
	public static void main(String[] args) throws Exception	{
		Score score = new Score();
		Scanner sc = new Scanner(new File("scoreData.txt"));

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			
			score.add(sc2.next(), sc2.next(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt());
		}
		score.displayList();
	}
} // class ScannerEx4 {

class Score {
	ArrayList record = new ArrayList();

	int koreanTotal = 0;
	int mathTotal = 0;
	int englishTotal = 0;

	void add(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		Student s = new Student(name, studentNo, koreanScore, mathScore, englishScore);
		record.add(s);
		koreanTotal += s.koreanScore;
		mathTotal += s.mathScore;
		englishTotal += s.englishScore;
	}

	int getSubjectTotal() {
		return koreanTotal + mathTotal + englishTotal;
	}

	void displayList() {
		if(record.size()==0) {
			System.out.println("표시할 데이터가 없습니다.");
			return;
		}

		System.out.println("이름   번호  국어  수학  영어    총점");
		System.out.println("======================================");

		for(int i=0; i < record.size(); i++)
			System.out.println((Student)record.get(i));

		System.out.println("======================================");
		System.out.println(Student.format("" + record.size(), 2, Student.RIGHT) + "명 총점 : " 
				+ Student.format(""+koreanTotal, 5, Student.RIGHT) 
				+ Student.format(""+mathTotal, 6, Student.RIGHT)
				+ Student.format(""+englishTotal, 6, Student.RIGHT)
				+ Student.format(""+getSubjectTotal(), 8, Student.RIGHT)
		);
	}	// void displayList()
}	// class Score

class Student {
	final static int LEFT = 0;
	final static int CENTER = 1;
	final static int RIGHT = 2;

	String name = "";
	String studentNo = "";
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore =0;

	Student(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		this.name = name;
		this.studentNo = studentNo;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}

	int getTotal() {
		return koreanScore + mathScore + englishScore;	
	}

	public String toString() {
		return format(name, 4, LEFT) 
			+ format(studentNo, 4, RIGHT) 
			+ format(""+koreanScore,6, RIGHT) 
			+ format(""+mathScore,6, RIGHT)
			+ format(""+englishScore, 6, RIGHT) 
			+ format(""+getTotal(),8, RIGHT);
	}

	static String format(String str, int length, int alignment) {
		int diff = length - str.length();

		if(diff < 0) return str.substring(0, length);

		char[] source = str.toCharArray();
		char[] result = new char[length];

		// 배열 result를 공백으로 채운다.
		for(int i=0; i < result.length; i++)
			result[i] = ' ';
		
		switch(alignment) {
			case CENTER :
			   System.arraycopy(source, 0, result, diff/2, source.length);
			   break;
			case RIGHT :
			     System.arraycopy(source, 0, result, diff, source.length);
			     break;
			case LEFT :
			default :
				System.arraycopy(source, 0, result, 0, source.length);
		}

		return new String(result);
	} // 	static String format(String str, int length, int alignment) {
}	// class Student {