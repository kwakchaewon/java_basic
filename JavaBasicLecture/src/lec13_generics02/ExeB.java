package lec13_generics02;

public class ExeB {
	public <T> T method1(T t) {
		return t;
	}
	
	public static <T> T method2(T t) {
		return t;
	}
	
	public <T> T method3(ExeA<T> exeA) {
		return exeA.getT();
	}
	
	public static <T>T method4(ExeA<T> exeA){
		return exeA.getT();
	}
}
