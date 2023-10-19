package lec12;


// 익명클래스: 객체 생성 후 바로 사용
public class UnanyClassMainMethod {
	public static void main(String[] args) {
		
		// Runnable(): 일종의 쓰레드 관련 클래스
		// new Runnable ctrl+space
		Runnable action = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnalbe 구동 중");
			}
		};
		action.run();
}
}
