import java.util.*;

class GenericsEx3
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕",1,1,100,100,100));
		list.add(new Student("자바짱",1,2,90,80,70));
		list.add(new Student("홍길동",2,1,70,70,70));
		list.add(new Student("전우치",2,2,90,90,90));

		Collections.sort(list); // list를 정렬한다.

		Iterator<Student> it = list.iterator();

		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
	}
}

class Student implements Comparable<Student> { 
	String name = ""; 
	int ban = 0; 
	int no = 0; 
	int koreanScore = 0; 
	int mathScore = 0; 
	int englishScore = 0; 

	int total = 0; 

	Student(String name, int ban, int no, int koreanScore, int mathScore, int englishScore) { 
		this.name = name; 
		this.ban = ban; 
		this.no = no; 
		this.koreanScore = koreanScore; 
		this.mathScore = mathScore; 
		this.englishScore = englishScore; 

		total = koreanScore + mathScore + englishScore; 
	} 

	public String toString() { 
		return name + "\t" 
		+ ban + "\t" 
		+ no + "\t" 
		+ koreanScore + "\t" 
		+ mathScore + "\t" 
		+ englishScore + "\t" 
		+ total + "\t"; 
	} 

	public int compareTo(Student o) { 
		return o.total - this.total; 
	} 
} // end of class Student 
