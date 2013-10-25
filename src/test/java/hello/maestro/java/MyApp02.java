package hello.maestro.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class MyApp02 {

	public static void main(String[] args) throws Exception {


		URL url = null;
		
		BufferedReader input = null;
		String address = "http://gall.dcinside.com/board/view/?id=doosanbears_new&no=2843263&page=1";
		String line = "";
		
		url = new URL(address);
		
		input = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
		
		while((line=input.readLine()) != null){
			System.out.println(line);
		}
		
		input.close();
	}
}
