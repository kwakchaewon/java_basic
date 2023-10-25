package lec15.fileIO05.training02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

// BufferedInputStream: 입력스트림을 버퍼링하는 역할
// 데이터를 조금씩 읽어 메모리에 저장하고 이 버퍼를 통해 데이터를 읽어와 입출력 성능 향상
public class IOManyFunction10 {
	/**
	 * 1,2,3,4,5,6,7,8,9,10 : 10번 전송할 것을
	 * [1,2,3,4,5], [6,7,8,9,10] 2번 나눠서 전송
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// 1. FileInputStream 생성 후 BufferedInputStream으로 래핑(감쌈)
		String filePath = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\file2.txt");
		
		BufferedInputStream bis = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(filePath));
			
			// 2. 버퍼 선언 후 read
			byte[] byteBowl = new byte[20];
			
			while (true) {
				int read = bis.read(byteBowl);
				if (read == -1) {
					break;
				}
				
				String message = new String(byteBowl, 0 , read);
				System.err.print(message);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}try {
			if (bis !=null) {
				bis.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
