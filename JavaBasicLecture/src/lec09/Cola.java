package lec09;

// 콜라 부모 클래스
public class Cola {
	public String colaName = String.valueOf("콜라");
	
	public void showColaProperty() {
		System.out.println("음료 종류는 탄산");
	}
	
	public void showColaName(String getColaName) {
		colaName = String.valueOf(getColaName);
		System.out.println("콜라 이름 ::: " + colaName);
	}
}
