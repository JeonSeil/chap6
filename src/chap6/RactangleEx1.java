package chap6;
/*
 * 사각형 클래스 3개를 생성하기
 * 1번사각형 : 가로 10, 세로 10인 사각형
 * 2번사각형 : 가로 5, 세로 20인 사각형
 * 3번 사각형: 가로 15, 세로 2인 사각형
 * 을 생성하여, 각각 사각형의 넓이와 둘레를 구하는 프로그램 작성하기
 * 
 * 
 */
class Rectangle {
	int width, height,serialno; //인스턴스 변수 
	static int cnt; //클래스변수
	void area() {
		System.out.println(serialno + "번 사각형의 넓이:"+ width*height);
	}
	void length() {
		System.out.println(serialno + "번 사각형의 둘레:"+ (width+height)*2);
	}
	boolean isSquare() {
		return width == height;
	}
}
public class RactangleEx1 {
	public static void main(String[] args) {
		Rectangle[] rarr = new Rectangle[3];
		rarr[0] = new Rectangle();
		rarr[0].serialno = ++Rectangle.cnt; //1
		rarr[0].width = 10;
		rarr[0].height = 10;

		rarr[1] = new Rectangle();
		rarr[1].serialno = ++ Rectangle.cnt; //2
		rarr[1].width = 5;
		rarr[1].height = 20;

		rarr[2] = new Rectangle();
		rarr[2].serialno = ++ Rectangle.cnt; //3
		rarr[2].width = 15;
		rarr[2].height = 2;
		for(Rectangle r : rarr) {
			r.area();
			r.length();
			if(r.isSquare()) {
				System.out.println(r.serialno + "번 사각형은 정사각형 입니다.");
			} else {
				System.out.println(r.serialno + "번 사각형은 직사각형 입니다.");
			}
		}		
	}
}
