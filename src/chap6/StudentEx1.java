package chap6;
/*
 * Student 클래스 구현하기
 * 멤버변수 : 이름(name), 반(ban), 번호(no), 국어점수(kor), 영어점수(eng),수학점수(math)
 *          static int count;
 * 멤버메서드 : 
 *       1. int getTotal()   : 학생별 점수의 총합을 리턴
 *       2. float getAverage() : 학생별 평균
 *       3. void info()     : 번호, 이름, 반, 국어, 영어,수학 총점,평균을 출력하기
 * 생성자 :
 *    1. 매개변수(이름,반) : 이름,반, 번호는 초기화 하고 나머지는 0으로 초기화.
 *                           번호는 count로 자동 생성하기 
 *    2. 매개변수(이름,반,국어,영어,수학) : 이름,반, 번호,국어,영어,수학 초기화하기      
 *                           번호는 count로 자동 생성하기 
 */
class Student {
	static int count;
	String name;
	int ban,no,kor,eng,math;
	Student(String name,int ban,int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		no = ++count;
	}
	Student(String name,int ban) {
		this(name,ban,0,0,0);
	}
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return getTotal()/3f;
	}
	void info() {
		System.out.println
		(no + "번 학생=> 이름:"+name + ",반:"+ban + ",국어:"+kor+",영어:"+eng+",수학:"+math 
				 +",총점:"+getTotal() + ",평균:"+getAverage());
	}
}
public class StudentEx1 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동",1);
		s1.info();
		Student s2 = new Student("김삿갓",1,90,80,70);		
		s2.info();
		Student s3 = new Student("이몽룡",1,95,85,75);		
		s3.info();
	}
}