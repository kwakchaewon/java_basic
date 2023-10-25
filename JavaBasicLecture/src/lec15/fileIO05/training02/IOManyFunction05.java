package lec15.fileIO05.training02;

import java.io.FileInputStream;

// 바이트 배열로 데이터를 읽고 출력
public class IOManyFunction05 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\test.txt");
			
			byte[] by = new byte[10];
			
			while(true) {
				int read = fis.read(by);
				if (read== -1) {
					break;
				}
				String msg = new String(by, 0 , read);
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			
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

//출력결과
//This is te
//st documen
//t.
