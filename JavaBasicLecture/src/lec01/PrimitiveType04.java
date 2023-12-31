package lec01;

public class PrimitiveType04 {
	public static void main(String[] args) {
		
		// boolean: 참거짓 타입
		boolean isTrue = false;
		
		// char: 문자열 타입
		char oneChar = '가';
		char twoChar='나';
		
		// 숫자형 타입
		byte firstByte = 1;
		short secondByte = 2;
		int third = 3;
		long forth = 4;
		
		int frontData = 0;
		int backData = 3;
		int multipleData = frontData + backData;

		System.out.println("multipleData: " + multipleData);
		
		int intA = 0 ;
		long longB = 20l; // long 타입의 경우 선언시 숫자뒤에 l을 붙인다
		// int C = intA + longB // 에러남: long 형이 더 큰 데이터 타입이므로
		long C = intA + longB; // 더 큰 long 타입의 담기때문에 에러 발생하지 않음
		
		
		// 실수형 자료형
		
		float floatA = 10.1f; // float 의 경우 선언시 숫자뒤에 f를 붙인다. f를 붙이는 건 귀찮고 자료형도 크기 때문에 부분 double로 코딩한다
		double doubleB = 20.2;
		
		float floatAB = 10.2f;
		
		float floatA1 = 10.1f;
		double doubleB1 = 20.2;
		double dfAB1 = floatA1 + doubleB1;
		System.out.println("dfAB1 ::: " + dfAB1);
		
		// 주석: ctrl shift slash
		// 주석 해제: ctrl shift \
		// boolean: 1byte, char: 2byte, int: 4byte, float: 4byte, long: 8byte, double: 8byte
		
		
		
	}
}
