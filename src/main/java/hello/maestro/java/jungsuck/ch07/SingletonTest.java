final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//...
	}

	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}	

	//...
}

class SingletonTest {
	public static void main(String args[]) {
//		Singleton s = new Singleton();	// ¿¡·¯! Singleton() has private access in Singleton	
		Singleton s1 = Singleton.getInstance();
	}
}