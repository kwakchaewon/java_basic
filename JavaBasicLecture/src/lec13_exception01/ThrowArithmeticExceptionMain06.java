package lec13_exception01;

public class ThrowArithmeticExceptionMain06 {
	
	public static void main(String[] args) throws GetArithmeticException05{
		
		throw new GetArithmeticException05("숫자 계산에서 예외 발생");
	}
}
