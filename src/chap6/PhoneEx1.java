package chap6;
//Ŭ���� : ����� ���� �ڷ���
class Phone {
	String color;   //��� ����
	boolean power;  //��� ����
	String no;      //��� ����
	void power() {  //��� �޼���
		power = !power;
	}
	void send(String no) {  //��� �޼���
		System.out.println(no + "�� ��ȭ �۽� ��~");
	}
	void receive(String no) { //��� �޼���
		System.out.println(no + "���� ��ȭ ���� ��~");
	}	
}
//����Ŭ���� : main �޼��带 ������ �ִ� Ŭ����
public class PhoneEx1 {
	public static void main(String[] args) {
//		Phone p1 = new Phone(); //��üȭ, �ν��Ͻ�ȭ
		Phone p1;     //���������� ����
		p1 = new Phone();  //��üȭ
		/*
		 * new ������ : ��ü�� �޸� �Ҵ�. �������� ��ü ����
		 *   1. �������� �޸� �Ҵ�.
		 *   2. ������� �⺻������ �ʱ�ȭ
		 *       �������� : null
		 *       boolean : false
		 *       ���� : byte, short,int,long, float, double => 0
		 *       ���� : char => \u0000. �����ڵ� 0
		 *   3. ������ ȣ��    
		 */
		p1.color = "����";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01012341234");
		p1.receive("01012341234");
		Phone p2 = new Phone(); //��üȭ, �ν��Ͻ�ȭ
		p2 = p1;
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
	}
}