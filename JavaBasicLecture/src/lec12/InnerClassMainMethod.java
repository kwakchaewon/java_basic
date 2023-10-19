package lec12;

public class InnerClassMainMethod {
	public static void main(String[] args) {
		
		InnerClassMake innerClassMake =new InnerClassMake();
		InnerClassMake.SampleInnerClass sampleInnerClass = innerClassMake.new SampleInnerClass();
		
		innerClassMake.outMainMethod1();
		sampleInnerClass.inMethod1();
		
		// "외부 클래스의 메소드 1" 출력
		// "내부 클래스 메소드1" 출력
	}
}
