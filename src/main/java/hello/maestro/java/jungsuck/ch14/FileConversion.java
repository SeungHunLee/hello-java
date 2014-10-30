import java.io.*;

class FileConversion {
	public static void main(String args[]) {

		try {
			FileReader fis = new FileReader(args[0]);
			FileWriter fos = new FileWriter(args[1]);

			int data =0;

			while((data=fis.read())!=-1) {
			      if(data!='\t' && data!='\n' && data!=' ' && data !='\r')
					fos.write(data);
			}

			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();		
		}
	} // main
}