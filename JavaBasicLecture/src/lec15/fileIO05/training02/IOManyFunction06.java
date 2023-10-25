package lec15.fileIO05.training02;

import java.io.FileOutputStream;

public class IOManyFunction06 {
	public static void main(String[] args) {
		
		String path = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\test2.txt");
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(path);
			
			
			// 방식 1: int로 변환된 데이터 사용
			fos.write((int)'T');
			fos.write((int)'E');
			fos.write((int)'S');
			fos.write((int)'T');
			fos.write((int)'\r');
			fos.write((int)'\n');
			
			// 방식2: getBytes() 로 작성
			fos.write("futures\r\n". getBytes());
			
			// 방식3: Byte 배열로 변환 후 작성
			byte[] msg = "StockAndBonds".getBytes();
			fos.write(msg);
			
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
				try {
				
				// fis 가 null 이 아니라면 닫자
				if(fos != null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
}

// 폴더확인시
//TEST
//futures
//StockAndBonds

