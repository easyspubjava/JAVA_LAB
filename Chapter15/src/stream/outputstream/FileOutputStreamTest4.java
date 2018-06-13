package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		fos = new FileOutputStream("output4.txt", true);
		
		fos.write(65);  //A
		fos.write(66);  //B
		fos.write(67);  //C
		
		fos.flush();
		fos.close();
		
		System.out.println("파일이 생성되었습니다");
	}
}
