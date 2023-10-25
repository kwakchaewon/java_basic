package lec15.fileIO05.training02;

import java.io.BufferedReader;
import java.io.FileReader;

// BufferedReader: 파일리더와 크게 다르진 않음. 버퍼 사용
public class IOManyFunction13 {
	public static void main(String[] args) {
		
		String path = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\file2.txt");
		
		BufferedReader bf = null;
		
		try {
			
			bf = new BufferedReader(new FileReader(path));
			
			while (true) {
				
				//readLine: 읽어온 단위를 라인단위로 읽기
				String strReadLine = bf.readLine();
				if (strReadLine==null) {
					break;
				} 
				System.out.println(strReadLine);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	
	}
}
