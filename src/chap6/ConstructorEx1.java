package chap6;
/*
 * 생성자 예제
 *  생성자란 객체 생성시 호출되는 메서드임. 생성자 없는 객체 생성은 불가함.
 * 생성자의 이름은 클래스명과 같고, 리턴타입이 없다. void가 아니고 기술하지 않는다.  

 *  기본생성자 : 개발자가 생성자를 구현하지 않으면 컴파일러가 추가 해주는 생성자
 *            public 클래스명(){}  
 */
class Number1 {  //기본 생성자를 가진 클래스
	int num;
}
class Number2 {
	int num;
	Number2(int x) { //생성자, 기본생성자 제공 안됨
		num = x;
	}
}
public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new 연산자 기능
		 * 1. 힙영역에 메모리 할당
		 * 2. 기본값으로 멤버변수 초기화
		 * 3. 생성자 (Number1()) 호출
		 */
		n1.num = 100;
		System.out.println("Number1.num=" + n1.num);
		Number2 n2 = new Number2(100);
		System.out.println("Number2.num=" + n2.num);
	}
}
