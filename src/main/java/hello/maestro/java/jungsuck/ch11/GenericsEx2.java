import java.util.*;

class GenericsEx2
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("ÀÚ¹Ù¿Õ",1,1));
		list.add(new Student("ÀÚ¹ÙÂ¯",1,2));
		list.add(new Student("È«±æµ¿",2,1));
		list.add(new Student("Àü¿ìÄ¡",2,2));

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
