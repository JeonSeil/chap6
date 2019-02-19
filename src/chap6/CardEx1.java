package chap6;
/*
 * 클래스 변수, 인스턴스 변수 예제 : 선언되는 위치가 클래스 내부에 선언됨
 * 
 * 클래스변수 :     선언방법 : static 자료형 변수명
 *           메모리할당위치 : 클래스 영역
 *           메모리할당시기 : 클래스 정보 로드시
 *           특징 : 1. 객체화 필요 없음.
 *                 2.모든 객체의 공통변수로 사용됨.
 *           사용법 : 클래스명.변수명.     
 * 
 * 인스턴스변수 :    선언방법 : 자료형 변수명
 * (객체변수)  메모리할당위치 : 힙 영역
 *           메모리할당시기 : 객체화 시
 *           특징 : 1. 반드시 객체화가 필요함. 
 *                 2. 객체별로 다른 메모리 영역을 가짐
 *           사용법 : 참조변수명.변수명.     
 */
class Card {
	String type;  //인스턴스변수
	int number;   //인스턴스변수
	static int width = 150;  //클래스변수
	static int height = 250; //클래스변수
	//객체의 문자열화하는 메서드. 참조변수이름을 출력하면 자동 호출되는 메서드
	public String toString() {
		return type + ":" + number + "(" + width+"," + height + ")";
	}
}
public class CardEx1 {
	public static void main(String[] args) {
		System.out.println("Card의 크기 :" + Card.width + "," + Card.height);
		//오류발생. 인스턴스 변수는 객체화 되어야 사용이 가능함
	//	System.out.println(Card.type + ":" + Card.number); 
		Card c1 = new Card();
		c1.type = "Spade";
		c1.number = 1;
		Card c2 = new Card();
		c2.type = "Clover";
		c2.number = 10;
		System.out.println(c1);
		System.out.println(c2);
		c1.width = 50;
		c1.height = 80;
		Card.width = 50;
		Card.height = 80;
		System.out.println(c1);
		System.out.println(c2);
	}
}
