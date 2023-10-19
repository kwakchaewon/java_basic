package lec10;

// 표준화: 인터페이스는 기능목록이 정의되고 클래스에서는 그 기능 목록을 반드시 정의한다
// implements 정의 후 오류 클릭 > add unimplement methods
public class ProgramInterfaceImpl implements ProgramInterface{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("프로그램 종료");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("프로그램 실행");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("프로그램 중지");
	}
	
}
