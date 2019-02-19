package chap6;
//클래스 : 사용자 정의 자료형
class Phone {
	String color;   //멤버 변수
	boolean power;  //멤버 변수
	String no;      //멤버 변수
	void power() {  //멤버 메서드
		power = !power;
	}
	void send(String no) {  //멤버 메서드
		System.out.println(no + "로 전화 송신 중~");
	}
	void receive(String no) { //멤버 메서드
		System.out.println(no + "에서 전화 수신 중~");
	}	
}
//구동클래스 : main 메서드를 가지고 있는 클래스
public class PhoneEx1 {
	public static void main(String[] args) {
//		Phone p1 = new Phone(); //객체화, 인스턴스화
		Phone p1;     //참조변수의 선언
		p1 = new Phone();  //객체화
		/*
		 * new 연산자 : 객체의 메모리 할당. 힙영역에 객체 생성
		 *   1. 힙영역에 메모리 할당.
		 *   2. 멤버들을 기본값으로 초기화
		 *       참조변수 : null
		 *       boolean : false
		 *       숫자 : byte, short,int,long, float, double => 0
		 *       문자 : char => \u0000. 유니코드 0
		 *   3. 생성자 호출    
		 */
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01012341234");
		p1.receive("01012341234");
		Phone p2 = new Phone(); //객체화, 인스턴스화
		p2 = p1;
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
	}
}