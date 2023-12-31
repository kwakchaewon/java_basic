package lec09;


// 부모 클래스 상속
// 1) extends 로 부모 클래스를 상속 받는다
// 2) 우클릭 > Source > Override methods 클릭 후 재정의할 변수와 메서드 선택
public class CocaCola extends Cola{

	@Override
	public void showColaProperty() {
		super.showColaProperty();
	}

	@Override
	public void showColaName(String getColaName) {
		super.showColaName(getColaName);
	}
	
	public void whereIsCocaCola() {
		System.out.println("미국 조지아");
	}
}
