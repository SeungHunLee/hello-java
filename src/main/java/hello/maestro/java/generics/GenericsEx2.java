package hello.maestro.java.generics;

import java.util.*;

/**
 * 출처 : Java의 정석, Chapter 11.4 제네릭스(Generics)
 * */
class GenericsEx2
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕",1,1));
		list.add(new Student("자바짱",1,2));
		list.add(new Student("홍길동",2,1));
		list.add(new Student("전우치",2,2));

		Iterator<Student> it = list.iterator();

		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name);
		}
	} // main
}

class Student {
	String name = "";
	int ban;
	int no;

	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}
