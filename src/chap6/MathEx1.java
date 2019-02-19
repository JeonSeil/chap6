package chap6;
/*
 * 메서드 예제
 * 메서드의 구성
 * [접근제어자] 리턴타입 메서드명(매개변수목록)  => 선언부
 * {                                    => 구현부
 *     ....
 * }
 * 
 * 리턴타입 : 메서드 종료시 전달되는 값의 자료형 지정. void 인 경우는 전달 값이 없다.
 * 매개변수목록 : 메서드를 호출시 전달되는 값의 자료형과 변수명 지정.
 *             매개변수는 해당 메서드 지역변수로 처리됨. 해당 메서드 내에서만 사용이 가능한 변수임.
 * return 구문 : 메서드의 구현부에서 작성됨. 메서드 종료
 *            리턴타입이 void 인 경우는 생략 가능함.
 *            리턴타입이 void 가 아닌 경우는 반드시 return 값; 작성 해야함.
 *             값 의 자료형이 리턴타입과 같거나, 리턴타입으로 자동형변환이 되는 경우 여야 한다.           
 */
class Math1 {
	char add1(int a, int b) {
		return (char) (a + b);
	}
	long add2(int a , int b) {
		return a + b;
	}
	double add3(int a , int b) {
		return a + b;
	}
}
public class MathEx1 {
	public static void main(String[] args) {
		Math1 m = new Math1();
		System.out.println(m.add1(45, 20));
		System.out.println(m.add2(10, 20));
		System.out.println(m.add3(10, 20));
	}
}
