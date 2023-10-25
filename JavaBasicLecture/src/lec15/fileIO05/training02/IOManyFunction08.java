package lec15.fileIO05.training02;

import java.io.FileReader;

// FileReader: 캐릭터 단위로 읽는 텍스트 파일 읽기 위한 문자 기반 스트림 클래스
// 바이트 단위로 읽을땐 문자가 깨지나 char 단위로 읽을 때는 문자가 깨지지 않음 (char로 읽을때 장점)
public class IOManyFunction08 {
	public static void main(String[] args) {
		
		FileReader fileReader = null;
		String filePath = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\file.txt");
		
		try {
			fileReader = new FileReader(filePath);
			
			while (true) {
				int read = fileReader.read();
				if(read == -1) {
					break;
				}
				System.out.print((char)read);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
