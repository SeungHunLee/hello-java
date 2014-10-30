import java.io.*;
import java.util.Arrays;

class DataOutputStreamEx2 {
	public static void main(String args[]) {
		ByteArrayOutputStream bos = null;
		DataOutputStream dos = null;

		byte[] result = null;

		try {
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);

			result = bos.toByteArray();

			String[] hex = new String[result.length];

			for(int i=0;i<result.length; i++) {
				if(result[i] < 0) { 
					hex[i] = Integer.toHexString(result[i]+256);
				} else {
					hex[i] = Integer.toHexString(result[i]);
				}

				// hex[i] = "0"+hex[i]; 
				// hex[i] = hex[i].substring(hex[i].length()-2);
			}

			System.out.println("10진수  :" + Arrays.toString(result));
			System.out.println("16진수  :" + Arrays.toString(hex));

			dos.close();
		} catch (IOException e) {
			e.printStackTrace();		
		}
	} // main
}