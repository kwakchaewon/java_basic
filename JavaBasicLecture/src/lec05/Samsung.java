package lec05;

public class Samsung extends Electronics{
	// extends 를 통해 상속받게 되면 해당 클래스가 가지고 있는 변수와 메서드를 사용할 수 있다.
	// 부모 클래스로부터 공통된 속성값을 쓰고 이를 재정의 할수 있다.
	
	int productsCnt = 0;
	
	public void showCount() {
		System.out.println("value ::: " + productsCnt);
		System.out.println("value ::: " + super.productsCnt); //super: 부모 클래스 오리지널 데이터 출력
	}
}
