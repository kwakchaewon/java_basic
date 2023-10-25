package lec15.fileIO05.training02;

import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

// FileOutputStream
public class IOManyFunction11 {
	public static void main(String[] args) {
		
		// 1. FileOutputStream 생성 후 BufferedOutputStream으로 래핑(감쌈)
		String filePath = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\file3.txt");

		BufferedOutputStream bos = null;
		
		try {
			
			bos = new BufferedOutputStream(new FileOutputStream(filePath));

			bos.write('b');
			bos.write('a');
			bos.write('n');
			bos.write('k');
			bos.write('.');
			bos.write('\r');
			bos.write('\n');
			
			// 2.  버퍼 크기 지정 및 데이터 출력
			bos.write("deposit and withdrawal".getBytes());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 닫기
				bos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		try {
			Desktop.getDesktop().open(new File(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
