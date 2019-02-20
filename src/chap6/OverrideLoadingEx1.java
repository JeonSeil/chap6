package chap6;
/*
 * 메서드 오버 로딩 예제
 *   동일 클래스 내에 같은 이름의 메서드가 여러개 존재 할 수 있다. 단 매개변수 목록이 달라야 한다.
 *   1. 메서드이름이 같다.
 *   2. 매개변수가 다르다. (매개변수이름이 아니고 자료형이 달라야 한다. 갯수,순서,자료형)
 *   3. 리턴타입이다, 접근제어자는 상관없다.
 */
class Math3 {
	int a = 10;
	public int add(int b) {
		System.out.print("1:");
		return a + b;
	}
//	int add(int x) {
//		System.out.print("1:");
//		return a + x;
//	}
	double add(double b) {
		System.out.print("2:");
		return a + b;
	}
	String add(String b) {
		System.out.print("3:");
		return a + b;
	}
}
public class OverrideLoadingEx1 {
	public static void main(String[] args) {
		Math3 m = new Math3();
		System.out.println(m.add(10));
		System.out.println(m.add(10.0));
		System.out.println(m.add("번"));
	}
}
