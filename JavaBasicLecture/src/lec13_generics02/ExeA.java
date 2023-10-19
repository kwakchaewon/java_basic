package lec13_generics02;


// Generics: 컬렉션 프레임워크의 타입 지정
// T: 임의의 타입

public class ExeA<T> {
	private T t;
	
	public  ExeA(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}
