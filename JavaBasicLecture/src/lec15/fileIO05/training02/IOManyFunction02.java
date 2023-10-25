package lec15.fileIO05.training02;

import java.io.UnsupportedEncodingException;


// 어떤 에러가 날지 모르기 때문에 최상위 Exception으로 에러 처리
// 인코딩: 문자열을 01 로 바꾸는 과정
public class IOManyFunction02 {
	public static void main(String[] args) throws Exception {
		
		String strProperty = System.getProperty("file.encoding");
		System.out.println("strProperty : " + strProperty);
		
		String msg1 = String.valueOf("한글");
		
		// 인코딩
		//getBytes(인코드 타입): 문자열을 인코드 타입으로 인코딩
		byte [] bytes = msg1.getBytes();
		byte [] ms949s = msg1.getBytes("MS949");
		byte [] eucKrs = msg1.getBytes("EUC-KR");
		byte [] utf8s = msg1.getBytes("utf-8");
		
		System.out.println("bytes : " + bytes);
		System.out.println("ms949s : " + ms949s);
		System.out.println("eucKrs : " + eucKrs);
		System.out.println("utf8s : " + utf8s);
		System.out.println();
		
		// 디코딩
		String strBytes = new String(bytes);
		String strMs949s = new String(ms949s, "MS949");
		
		System.out.println("strBytes : " + strBytes);
		System.out.println("strMs949s : " + strMs949s);
		
		
	}
}
