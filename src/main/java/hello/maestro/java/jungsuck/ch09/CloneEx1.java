class Point implements Cloneable { // Cloneable인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다. 이 인터페이스를 구현하지 않고 clone()을 호출하면 예외가 발생한다.
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x="+x +", y="+y;
	}

	public Point clone() {
		Object obj=null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {} // clone메서드에는 CloneNotSupportedException이 선언되어 있으므로 이 메서드를 호출할 때는 try-catch문을 사용해야한다.
		return (Point)obj;
	}
}

class CloneTest {
	public static void main(String[] args){
		Point original = new Point(3, 5);
		Point copy = original.clone(); // 객체를 복제해서 새로운 객체를 만든다.
		System.out.println(original);
		System.out.println(copy);
	}
}




