package lec15.fileIO05.training02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


// 파일 IO 별 속도 차이
public class IOManyFunction12 {
	
	public static void readFile (String path) throws Exception {
		
		FileInputStream fis = new FileInputStream(path);
		byte [] byteBowl = new byte [10];
		while (true) {
			int read = fis.read(byteBowl);
			if (read == -1) {
				break;
			}
			
			String message = new String(byteBowl, 0, read);
			
		}
		
		fis.close();
	}


public static void readBuffer(String path) throws Exception{
	
		BufferedInputStream bis= new BufferedInputStream(new FileInputStream(path));
		byte [] byteBowl = new byte[10];
		
		while (true) {
			int read = bis.read(byteBowl);
			if(read==-1) {
				break;
			}
			String message = new String (byteBowl, 0, read);			
		}
		
		bis.close();
}


public static void main(String[] args) throws Exception {
	
	String path = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\filespeed.txt");
	
	
	// 1. 파일 인풋스트림
	long start1 = System.currentTimeMillis();
	
	for (int i =0; i<50; i++) {
		readFile(path);
	}
	
	long end1 = System.currentTimeMillis();
	System.err.println("일반적인 파일 인풋스트림으로 걸린 시간: " + (end1-start1));
	
	// 2. 버퍼 스트림
	long start2 = System.currentTimeMillis();
	
	// 숫자가 커질수록 속도차이가 커짐
	for (int i =0; i<50; i++) {
		readBuffer(path);
	}
	
	long end2 = System.currentTimeMillis();
	System.err.println("버퍼를 사용한 스트림으로 걸린 시간: " + (end2-start2));
	
	// 3. 파일 그냥 읽어들이기
	long startFile1 = System.currentTimeMillis();
	for(int i=0; i<50;i++) {
		FileInputStream fis = new FileInputStream(path);
		while (true) {
			int read= fis.read();
			if(read==-1) {
				break;
			}
			char c = (char)read;
		}
		fis.close();
	}
	long endFile1 = System.currentTimeMillis();
	System.out.println("파일 그냥 읽어들인 시간: " + (endFile1-startFile1));
	
	// 4. 바이트 배열로 파일 읽어들인 시간
	long startFile2 = System.currentTimeMillis();
	for(int i=0; i<50;i++) {
		FileInputStream fis = new FileInputStream(path);
		byte [] byteBowl = new byte[1024];
		
		while (true) {
			int read= fis.read(byteBowl);
			if(read==-1) {
				break;
			}
			String message = new String(byteBowl, 0 , read);
		}
		// fis.close();
	}
	long endFile2 = System.currentTimeMillis();
	System.out.println("바이트 배열로 파일 읽어들인 시간: " + (endFile2-startFile2));
	
	
	
	
}

}

// 출력값
// 일반적인 파일 인풋스트림으로 걸린 시간: 82
// 버퍼를 사용한 스트림으로 걸린 시간: 15
// 파일 그냥 읽어들인 시간: 484
// 바이트 배열로 파일 읽어들인 시간: 11 (덩어리가 크면 클수록 좋다)
// 결론: 버퍼를 사용하는게 훨씬 빠르다.

// 서버가 바이트 10개짜리로 넘겨줘하는데 클라이언트가 16개로 넘겨주면 못알아먹음
// 따라서 통신할때의 바이트 배열 크기는 서버-클라이언트에 규칙화 되어있음




