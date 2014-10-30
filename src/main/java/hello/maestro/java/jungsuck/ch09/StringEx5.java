class StringEx5 {
	static String s;
	static String s2 = "";
	public static void main(String[] args) 
	{
		for(int i=1; i < 10; i++) {
			s  += i;		// s = s + i;			
			s2 += i;
		}

		System.out.println(s);
		System.out.println(s2);
	}
}