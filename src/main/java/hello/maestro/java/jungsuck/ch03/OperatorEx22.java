package hello.maestro.java.jungsuck.ch03;

class OperatorEx22 {
	public static void main(String args[]) {
		 int temp; // ��� ��� ��� ���� ����

		System.out.println(-8);
        // -8�� 2��� ���ڿ��� �����Ѵ�.
		System.out.println(Integer.toBinaryString(-8));	
		System.out.println();			
		
		temp = -8 << 1;
		System.out.println( "-8 << 1  = " + temp);	
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8 << 2;
		System.out.println( "-8 << 2  = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
				
		System.out.println();
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();
		
		temp = -8 >> 1;
		System.out.println( "-8 >> 1  = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8 >> 2;
		System.out.println( "-8 >> 2  = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
				
		System.out.println();
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();
		
		temp = -8 >>> 1;
		System.out.println( "-8 >>> 1  = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8 >>> 2;
		System.out.println( "-8 >>> 2  = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
	}
}