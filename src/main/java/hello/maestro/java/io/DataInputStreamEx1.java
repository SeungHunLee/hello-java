package hello.maestro.java.io;

import java.io.*;

/**
 * 출처 : Java의 정석, Chapter 14 입출력(I/O)
 * */
class DataInputStreamEx1 {
	public static void main(String args[]) {

		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);

			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();		
  		}
	} // main
}