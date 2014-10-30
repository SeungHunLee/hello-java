import java.util.*;

class GenericsEx5
{
	public static void main(String[] args) 
	{
		HashMap<String,Student> map = new HashMap<String,Student>();
		map.put("1-1", new Student("자바왕",1,1,100,100,100));
		map.put("1-2", new Student("자바짱",1,2,90,80,70));
		map.put("2-1", new Student("홍길동",2,1,70,70,70));
		map.put("2-2", new Student("전우치",2,2,90,90,90));

		Student s1 = map.get("1-1");
		System.out.println("1-1 :" + s1.name);
		
		Iterator<String> itKey = map.keySet().iterator();

		while(itKey.hasNext()) {
			System.out.println(itKey.next());
		}

		Iterator<Student> itValue = map.values().iterator();
		int totalSum = 0;

		while(itValue.hasNext()) {
			Student s = itValue.next();
			totalSum += s.total;
		}

		System.out.println("전체 총점:"+totalSum);
	} // main
}

class Student extends Person implements Comparable<Person> { 
	String name = ""; 
	int ban = 0; 
	int no = 0; 
	int koreanScore = 0; 
	int mathScore = 0; 
	int englishScore = 0; 

	int total = 0; 

	Student(String name, int ban, int no, int koreanScore, int mathScore, int englishScore) { 
		super(ban+"-"+no, name);
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

   // Comparable<Person>이므로 Person타입의 매개변수를 선언.
	public int compareTo(Person o) { 
	   return id.compareTo(o.id);    // String클래스의 compareTo()를 호출
	}

} // end of class Student 

class Person  {    
     String id;
     String name;

     Person(String id, String name) { 
         this.id = id;
         this.name = name; 
     }
}

