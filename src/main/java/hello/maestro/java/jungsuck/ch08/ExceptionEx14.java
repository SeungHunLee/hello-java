import java.io.*;
import java.util.*;

class ExceptionEx14 {
	public static void main(String args[]) {
		PrintStream ps = null;
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream("error.log",true); // error.log파일에 출력할 준비를 한다.
			ps=new PrintStream(fos); // err의 출력을 화면이 아닌, error.log파일로 변경한다.
			System.setErr(ps);

			System.out.println(1);			
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);	// 예외발생!!!
			System.out.println(4); 		// 실행되지 않는다.
		} catch (Exception ae)	{
			System.err.println("-----------------------------------");
			System.err.println("예외발생시간 : " + new Date());  // 현재시간출력
			ae.printStackTrace(System.err);
			System.err.println("예외메시지 : " + ae.getMessage());
			System.err.println("-----------------------------------");
		}	// try-catch의 끝

		System.out.println(6);
	}	// main메서드의 끝
}