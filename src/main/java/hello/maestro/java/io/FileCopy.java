package hello.maestro.java.io;

import java.io.*;

/**
 * 출처 : Java의 정석, Chapter 14 입출력(I/O)
 * */
class FileCopy {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);

			int data =0;

			while((data=fis.read())!=-1) {
				fos.write(data);	 // void write(int b)
			}

			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();		
		}
	}
}