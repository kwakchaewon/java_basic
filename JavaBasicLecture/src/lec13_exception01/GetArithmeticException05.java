package lec13_exception01;

public class GetArithmeticException05 extends ArithmeticException{
	
	public GetArithmeticException05(String message) {
		super("메시지 ::: " + message);
	}
}
