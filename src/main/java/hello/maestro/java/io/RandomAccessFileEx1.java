package hello.maestro.java.io;

import java.io.*;

/**
 * 출처 : Java의 정석, Chapter 14 입출력(I/O)
 * */
class RandomAccessFileEx1
{
	public static void main(String[] args) 
	{
		try {
			RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
			System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
			raf.writeInt(100);
			System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
			raf.writeLong(100L);
			System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}