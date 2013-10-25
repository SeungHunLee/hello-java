package hello.maestro.java.io;

import java.io.*;

/**
 * 출처 : Java의 정석, Chapter 14 입출력(I/O)
 * */
class RandomAccessFileEx3 {
	public static void main(String args[]) {
		int sum = 0;

		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
			int i=4;

			while(true) {
				raf.seek(i);
				sum += raf.readInt();
				i+=16;
			}
		} catch (EOFException e) {
			System.out.println("sum : " + sum);
		} catch (IOException e) {
			e.printStackTrace();		
		}
	}
}