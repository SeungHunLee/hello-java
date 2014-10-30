class StringEx3
{
	public static void main(String[] args) 
	{
		String s1 = "AAA";
		String s2 = new String("AAA");

		if (s1==s2) {
			System.out.println("s1==s2 ? true");
		} else { 
			System.out.println("s1==s2 ? false");
		}
		
		s2 = s2.intern();
		System.out.println("s2에 intern()을 호출한 후");

		if (s1==s2) {
			System.out.println("s1==s2 ? true");
		} else { 
			System.out.println("s1==s2 ? false");
		}

	}
}