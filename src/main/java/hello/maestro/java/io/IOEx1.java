package hello.maestro.java.io;

import java.io.*;
import java.util.Arrays;

/**
 * 출처 : Java의 정석, Chapter 14 입출력(I/O)
 * */
class IOEx1 
{
	public static void main(String[] args) 
	{
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;

		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		int data = 0;

		while((data = input.read())!=-1) {
			output.write(data);	// void write(int b)
		}

		outSrc = output.toByteArray();

		System.out.println("Input Source  :" + Arrays.toString(inSrc));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}