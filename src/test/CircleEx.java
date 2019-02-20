package test;
/*
 2. (1)원(Circle) 클래스 구현
    ① 멤버변수 :
        반지름, 원점x좌표, 원점y좌표, 원의 번호 no, 
        원의 번호를 생성시켜주는 count (static으로)
    ② 멤버 메소드
        a. area : 원의 넓이를 계산하는 메소드. Math.PI 상수 사용
        b. length : 원의 둘레를 계산하는 메소드. Math.PI 상수 사용
        c. toString : 현재 중심점과 반지름을 출력하는 메소드

    (1)구동 클래스(CircleEx) 구현
        - 원 객체들을 여러개 생성
        - 각 원의 번호, 반지름, x좌표, y좌표를 출력하기 
*/
class Circle {
	int r,x,y,no;
	static int count;
/*
     3.14  <= (int)((3.141592653589793 + 0.005) * 100) / 100.0
     12.57 <= 12.566370614359172+ 0.005 * 100
     28.27 <= 28.274333882308138+ 0.005 * 100
 */
	double area() {
		return Math.PI*r*r;
		//return (int)((Math.PI*r*r + 0.005) * 100) / 100.0;
	}
	double length() {
		return Math.PI*r*2;
		//return (int)((Math.PI*r*2 + 0.005)*100) / 100.0;
	}
	@Override
	public String toString() {  //재정의
//		String s = no + "번 원=>"+ "반지름:"+r + "(" + x + "," +y + "), 넓이:"
//	               +area() + ", 둘레:" + length();
		return no + "번 원=>"+ "반지름:"+r + "(" + x + "," +y + "), 넓이:"
	               + String.format("%.2f", area()) + ", 둘레:" 
		           + String.format("%.2f", length());
/*
  	%.2f : % :형식지정문자  .2f : 소숫점이하 2자리만 출력 지정. 소숫점이하 3자리에서 반올림됨.
 */
	}
}
public class CircleEx {
	public static void main(String[] args) {
		System.out.printf("%X\n",15); //16진수 출력
		System.out.printf("%o\n",15); //8진수 출력
		System.out.printf("%3d%3d\n",5,5); //10진수를 3자리로 출력

		Circle[] carr = new Circle[3];
		for(int i=0;i<carr.length;i++) {
			carr[i] = new Circle();
			carr[i].r = i+1;
			carr[i].x = i;
			carr[i].y = i;
			carr[i].no = ++Circle.count;
			System.out.println(carr[i]);
		}
	}
}
