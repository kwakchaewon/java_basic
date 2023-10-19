package lec13_exception01;

public class ThrowExceptionMain03 {
	// main 메소드에 TimeoutException04를 던짐
	public static void main(String[] args) throws TimeoutException04{
		
		// throw new TimeoutException04("에러 발생");
		
		throw new TimeoutException04("파일 입출력 중 발생한 에러");
	}
}
