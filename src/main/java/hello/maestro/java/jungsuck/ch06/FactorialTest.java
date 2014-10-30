class FactorialTest {
	public static void main(String args[]) {
		System.out.println(factorial(4)); // FactorialTest.factorial(4)
	}

	static long factorial(int n) {
		long result=0;

		if ( n == 1) {
			result = 1;		
		} else {
			result = n * factorial(n-1);		// 다시 메서드 자신을 호출한다.
		}

		return result;
	}
}