package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		 
		try(FileOutputStream fos = new FileOutputStream("output3.txt"))
		{
		
			byte[] bs = new byte[26];
			byte data = 65;     //'A' 의 아스키 값
			for(int i = 0; i < bs.length; i++){  // A-Z 까지 배열에 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);   // 배열의 2 번째 위치부터 10 개 바이트 출력하기
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
