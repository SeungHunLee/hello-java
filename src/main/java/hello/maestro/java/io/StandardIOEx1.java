package hello.maestro.java.io;

import java.io.*;

/**
 * 출처 : Java의 정석, Chapter 14 입출력(I/O)
 * */
class StandardIOEx1
{
	public static void main(String[] args) 
	{
		try {
			int input = 0;

			while((input=System.in.read())!=-1) {
				System.out.println("input :" + input + ", (char)input :" + (char)input);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	} // main
}