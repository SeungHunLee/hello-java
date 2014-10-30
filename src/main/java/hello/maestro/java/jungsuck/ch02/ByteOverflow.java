package hello.maestro.java.jungsuck.ch02;

class ByteOverflow 
{
	public static void main(String[] args) 
	{
		byte b = 0;				// byte�� ���� b�� �����ϰ� 0���� �ʱ�ȭ.
		int  i = 0;

        // �ݺ����� �̿��ؼ� b�� ���� 1��, 0���� 270���� ������Ų��.
		for(int x=0; x <= 270; x++) {	
			System.out.print(b++);   // print�� ��� ��  �ٹٲ��� ���� �ʴ´�.
			System.out.print('\t');  // tab�� ����Ѵ�.
			System.out.println(i++);
		}
	}
}