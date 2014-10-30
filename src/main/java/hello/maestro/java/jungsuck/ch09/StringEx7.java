class StringEx7
{
	public static void main(String[] args) 
	{
		int value = 100;
		String strValue = String.valueOf(value);	// int를 String으로 변환한다.
		
		int value2 = 100;
		String strValue2 = value2 + "";	// int를 String으로 변환하는 또 다른 방법

		System.out.println(strValue);
		System.out.println(strValue2);
	}
}