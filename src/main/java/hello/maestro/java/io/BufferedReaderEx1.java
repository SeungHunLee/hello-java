package hello.maestro.java.io;

import java.io.*;

/**
 * 출처 : Java의 정석, Chapter 14 입출력(I/O)
 * */
class BufferedReaderEx1 
{
	public static void main(String[] args) 
	{
		try {
			FileReader fr = new FileReader("BufferedReaderEx1.java");
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			for(int i=1;(line = br.readLine())!=null;i++) { 
				//  ";"를 포함한 라인을 출력한다.
				if(line.indexOf(";")!=-1)	
					System.out.println(i+":"+line);
			}
		} catch(IOException e) {}
	} // main
}