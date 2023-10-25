package lec15.fileIO05.training02;

import java.io.FileInputStream;

// FileInputStream: 텍스트 파일 읽기
public class IOManyFunction04 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		 try {
			fis = new FileInputStream("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\test.txt");
			
			while (true) {
				int read = fis.read();
				
				// 파일을 다 읽었다면 멈춰라
				if (read== -1) {
					break;
				}
				System.out.print((char)read);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				// fis 가 null 이 아니라면 닫자
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}

// 출력결과
// This is test document.