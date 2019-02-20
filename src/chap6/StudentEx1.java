package chap6;
/*
 * Student Ŭ���� �����ϱ�
 * ������� : �̸�(name), ��(ban), ��ȣ(no), ��������(kor), ��������(eng),��������(math)
 *          static int count;
 * ����޼��� : 
 *       1. int getTotal()   : �л��� ������ ������ ����
 *       2. float getAverage() : �л��� ���
 *       3. void info()     : ��ȣ, �̸�, ��, ����, ����,���� ����,����� ����ϱ�
 * ������ :
 *    1. �Ű�����(�̸�,��) : �̸�,��, ��ȣ�� �ʱ�ȭ �ϰ� �������� 0���� �ʱ�ȭ.
 *                           ��ȣ�� count�� �ڵ� �����ϱ� 
 *    2. �Ű�����(�̸�,��,����,����,����) : �̸�,��, ��ȣ,����,����,���� �ʱ�ȭ�ϱ�      
 *                           ��ȣ�� count�� �ڵ� �����ϱ� 
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
		(no + "�� �л�=> �̸�:"+name + ",��:"+ban + ",����:"+kor+",����:"+eng+",����:"+math 
				 +",����:"+getTotal() + ",���:"+getAverage());
	}
}
public class StudentEx1 {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿",1);
		s1.info();
		Student s2 = new Student("���",1,90,80,70);		
		s2.info();
		Student s3 = new Student("�̸���",1,95,85,75);		
		s3.info();
	}
}