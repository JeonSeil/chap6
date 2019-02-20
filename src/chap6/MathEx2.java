package chap6;
/*
 * 클래스 메서드  : 메서드의 선언부에 static 예약어가 기술됨
 *              클래스 정보 로드시 바로 메서드의 호출이 가능함.
 *              클래스명.메서드명(...) 호출이 가능함. 
 * 인스턴스 메서드: 메서드의 선언부에 static 예약어가 없음.
 *              객체화가 되어야 메서드의 호출이 가능함.
 *              참조변수명.메서드명(...) 호출이 가능함. 
 */
class Math2 {
	long a,b;
	static int c;
	long add1() {
		System.out.println(c);
		return a + b;
	}
	static long add2(int a, int b) {
		return a+b;
	}
}
public class MathEx2 {
	public static void main(String[] args) {
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(Math2.add2(10, 20));
	}
}
