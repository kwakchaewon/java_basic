package lec09;

public class MainMethod {
	public static void main(String[] args) {
		CocaCola coca = new CocaCola();
		PepsiCola pepsi = new PepsiCola();
		
		coca.showColaName("코카콜라");
		coca.showColaProperty();
		coca.whereIsCocaCola();
		
		pepsi.showColaName("코카콜라");
		pepsi.showColaProperty();
		pepsi.whereIsPepsiCola();
		
	}
}
