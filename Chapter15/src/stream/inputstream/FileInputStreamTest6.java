package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest6 {

	public static void main(String[] args) throws IOException {
				
		try (FileOutputStream fos = new FileOutputStream("resource.txt");
				FileInputStream fis = new FileInputStream("resource.txt")){   //try 구문안에서 선언된 경우 자동 close() 호출
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}