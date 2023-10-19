package lec11;

// 추상클래스: 구체적인 기능이 정의되지 않은 추상 메소드
// 보통 복잡한 메서드를 지원하지 않음. 간단한 로직과 공통된 로직을 구현.
// abstract 를 앞에 붙여 정의
public abstract class AbstractClass {
	
	public abstract void methodFirst();
	
	public void methodSecond() {
		System.out.println("추상클래스 methodSecond");
		methodFirst();
	}
	
	public int methodThirds() {
		return 10 + 2;
	}
	
}
