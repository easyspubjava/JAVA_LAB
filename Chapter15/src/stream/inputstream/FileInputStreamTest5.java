package stream.inputstream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) throws IOException {
				
		try (FileInputStream fis = new FileInputStream("input.txt")){
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}