package lec15.fileIO05.training02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 파일 복사
public class IOManyFunction07 {
	public static void main(String[] args) {
		
		// 1. 경로 지정
		String target = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\FileIOTextFile.txt");
		String destination = String.valueOf("D:\\dev\\workspace_java\\JavaBasicLecture\\FileIO\\FileIODuplicatedFile.txt");
		
		// 복사하려는 곳에 파일이 존재하면 파일 복사를 실행하지 않음
		try {
			File des_file = new File(destination);
			
			if (des_file.exists()) {
				String message = String.valueOf("이미 파일이 존재하여 복사가 불가능 합니다");
				
				// throw : 어떤 종류의 예외를 던질 것인지 명시
				throw new Exception(message);
			}
			
			// 2. 경로 기반의 input, output 파일 객체 설정
			FileInputStream fis = new FileInputStream(target);
			FileOutputStream fos = new FileOutputStream(des_file);
			
			// 3. 실제로 데이터 쓰려하니 통로를 열자
			byte[] byteBowl = new byte[1024];
			
			// 4. 파일 읽고 쓰기
			while (true) {
				int read = fis.read(byteBowl);
				if (read == -1) {
					break;
				}
				
				// write(String str, int off, int len): 문자열 str에서 off 위치부터 len 문자까지를 출력 스트림에 씁니다.
				fos.write(byteBowl,0,read);
			}
			
			System.out.println("파일 복사 성공");
			
			// 5. input, output stream 닫기
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println("복사 중 예외 발생");
			
			// e.printStackTrace(): 예외 객체 정보 출력. 디버깅 과정에서 매우 유용
			e.printStackTrace();
		}
	}
	

}
