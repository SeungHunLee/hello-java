import java.io.*;

class ExceptionEx13 {
	public static void main(String args[]) {

		PrintStream ps = null;		// 파일 error.log에 출력할 준비를 한다.
		FileOutputStream fos=null;

		try {
			fos = new FileOutputStream("error.log");
			ps = new PrintStream(fos);

			System.out.println(1);			
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);	// 예외발생!!!
			System.out.println(4); 		// 실행되지 않는다.
		} catch (Exception ae)	{
			ae.printStackTrace(ps);
			ps.println("예외메시지 : " + ae.getMessage()); // 화면대신 error.log파일에 출력한다.
		}	// try-catch의 끝
		System.out.println(6);
	}	// main메서드의 끝
}