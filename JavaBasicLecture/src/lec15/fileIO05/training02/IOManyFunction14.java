package lec15.fileIO05.training02;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//BufferedWriter: 파일리더와 크게 다르진 않음. 버퍼 사용
public class IOManyFunction14 {
	public static void main(String[] args) {
		String path = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\file2.txt");
	
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path));
			
			bw.write('c');
			bw.write('o');
			bw.write('m');
			bw.write('p');
			bw.write('a');
			bw.write('n');
			bw.write('y');
			bw.write('\r');
			bw.write('\n');
			
			char[] message = "Human resource \r\n".toCharArray();
			bw.write(message);
			
			bw.write("Account");
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		try {
			Desktop.getDesktop().open(new File(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
