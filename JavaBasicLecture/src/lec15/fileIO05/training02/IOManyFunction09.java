package lec15.fileIO05.training02;

import java.awt.Desktop;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// FileWriter: 
public class IOManyFunction09 {
	public static void main(String[] args) {
		FileWriter fileWriter = null;
		String filePath = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\file2.txt");
		
		try {
			fileWriter = new FileWriter(filePath);
			
			fileWriter.write('F');
			fileWriter.write('a');
			fileWriter.write('c');
			fileWriter.write('t');
			fileWriter.write('o');
			fileWriter.write('r');
			fileWriter.write('y');
			fileWriter.write('.');
			fileWriter.write('\r');
			fileWriter.write('\n');
			
			// 방법2
			char [] message = "Electronics. \r\n".toCharArray();
			fileWriter.write(message);
			
			fileWriter.write("Cars\r\n");
			
			fileWriter.write("중화학 공업");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fileWriter.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		try {
			// getDesktop(): 데스크톱 환경 제어 메서드
			// open(File file): 파일 여는 메서드
			Desktop.getDesktop().open(new File(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
