package lec12;

// 내부 클래스
public class InnerClassMake {
	
	public void outMainMethod1() {
		System.out.println("외부 클래스의 메소드 1");
	}
	
	class SampleInnerClass{
		public void inMethod1() {
			System.out.println("내부 클래스 메소드1");
		}
	}

}