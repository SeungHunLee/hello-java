package hello.maestro.java.generics;

import java.util.*;

/**
 * 출처 : Java의 정석, Chapter 11.4 제네릭스(Generics)
 * */
class GenericsEx3
{
	public static void main(String[] args) 
	{
		ArrayList<Student_GenericsEx3> list = new ArrayList<Student_GenericsEx3>();
		list.add(new Student_GenericsEx3("자바왕",1,1,100,100,100));
		list.add(new Student_GenericsEx3("자바짱",1,2,90,80,70));
		list.add(new Student_GenericsEx3("홍길동",2,1,70,70,70));
		list.add(new Student_GenericsEx3("전우치",2,2,90,90,90));

		Collections.sort(list); // list를 정렬한다.

		Iterator<Student_GenericsEx3> it = list.iterator();

		while(it.hasNext()) {
			Student_GenericsEx3 s = it.next();
			System.out.println(s);
		}
	}
}

class Student_GenericsEx3 implements Comparable<Student_GenericsEx3> { 
	String name = ""; 
	int ban = 0; 
	int no = 0; 
	int koreanScore = 0; 
	int mathScore = 0; 
	int englishScore = 0; 

	int total = 0; 

	Student_GenericsEx3(String name, int ban, int no, int koreanScore, int mathScore, int englishScore) { 
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

	public int compareTo(Student_GenericsEx3 o) { 
		return o.total - this.total; 
	}
} // end of class Student 
