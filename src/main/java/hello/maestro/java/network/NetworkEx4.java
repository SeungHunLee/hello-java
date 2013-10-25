package hello.maestro.java.network;
import java.net.*;
import java.io.*;

/**
 * 출처 : Java의 정석, Chapter 15 네트워킹(Networking)
 * */
public class NetworkEx4 {
	public static void  main(String args[]) {
		URL url = null;
		BufferedReader input = null;
		String address = "http://www.javachobo.com/sample/hello.html";
		String line = "";

		try {
			url = new URL(address);

			input = new BufferedReader(new InputStreamReader(url.openStream()));

			while((line=input.readLine()) !=null) {
				System.out.println(line);
			}
			input.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}