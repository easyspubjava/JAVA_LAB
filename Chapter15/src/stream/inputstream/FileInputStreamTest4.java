package stream.inputstream;
import java.io.FileInputStream;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		 		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while ( (i = fis.read(bs, 0, 10)) != -1){
				/*for(byte b : bs){
					System.out.print((char)b);
				}*/
				for(int k= 0; k<i; k++){
					System.out.print((char)bs[k]);
				}
				System.out.println(": " +i + "바이트 읽음" );
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}
}