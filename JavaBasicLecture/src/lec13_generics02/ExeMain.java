package lec13_generics02;

public class ExeMain {
	public static void main(String[] args) {
		
		ExeB b = new ExeB();
		String method1 = b.method1("테스트1");
		
		// 객체 생성 없이 바로 메서드 사용
		String method2 = ExeB.method2("테스트2");
		
		System.out.println("method1 : " + method1);
		System.out.println("method2 : " + method2);
		
		// String 으로 리턴값 지정
		// T의 형태로 지정해 여러가지 Type 을 활용할 수도 있다
		ExeA<String> exeA1 = new ExeA<>("1");
		String t1 = exeA1.getT();
		String method3 = b.method3(exeA1);
		String method4 = ExeB.method4(exeA1);
		
		System.out.println("t1 : " + t1);
		System.out.println("method3 : "+ method3);
		System.out.println("method4 : "+ method4);
		
		ExeA exeA2 = new ExeA("2");
		Object t2 = exeA2.getT();
		Object method6 = b.method3(exeA2);
		Object method5 = ExeB.method4(exeA2);
		
		System.out.println("t2 : " + t2);
		System.out.println("method6 : "+ method6);
		System.out.println("method5 : "+ method5);
		
		
		ExeA<Integer> exeAInt = new ExeA<>(100);
		Integer getIntT = exeAInt.getT();
		System.out.println("getInt : " + getIntT);
		Integer intExeAInt1 = b.method3(exeAInt);
		Integer intExeAInt2 = ExeB.method4(exeAInt);
		
		System.out.println("intExeAInt1 : " + intExeAInt1);
		System.out.println("intExeAInt2 : " + intExeAInt2);
		
	}
}

// 출력 결과
//method2 : 테스트2
//t1 : 1
//method3 : 1
//method4 : 1
//t2 : 2
//method6 : 2
//method5 : 2
//getInt : 100
//intExeAInt1 : 100
//intExeAInt2 : 100



