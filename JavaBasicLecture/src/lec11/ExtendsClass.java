package lec11;

// 추상 클래스를 상속 받기 위해 extends 키워드 추가 후, add unemplmented class
public class ExtendsClass extends AbstractClass{

	@Override
	public void methodFirst() {
		// TODO Auto-generated method stub
		System.out.println("상속받은 클래스의 오버라이딩된 methodFirst");
	}

	@Override
	public void methodSecond() {
		System.out.println("상속받은 클래스에서 로직이 더 들어갑니다");
		// TODO Auto-generated method stub
		super.methodSecond();
	}

	@Override
	public int methodThirds() {
		int getData = super.methodThirds();
		int addMoreData = 12;
		return getData + addMoreData;
	}
	
}
