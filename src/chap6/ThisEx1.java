package chap6;
/*
 * this �����
 * this ������  : ���� Ŭ���� �� �����ڿ���  �ٸ� �����ڸ� ȣ��
 *              �ݵ�� �������� ù�ٿ� �����ؾ� �Ѵ�. 
 * this ��������: �ڱ� ���� ����. �ν��Ͻ� �޼��忡�� ���� �ν��Ͻ� ����� ��Ī�� �� ����.
 *              �ν��Ͻ� �޼��� ���ο� ���������� �ڵ� �����.
 */
class Car {
	String color;
	int number;
	Car(String color,int number) {
		System.out.println("Car(String c,int n) ������ ȣ��");
		color = color;
		this.number = number;
	}
	Car(String c) {
		this(c,1);   //this ������
		System.out.println("Car(String c) ������ ȣ��");
	}
	Car(int n) {
//		color = "white";
//		number = n;
		this("white",n);  //this ������
		System.out.println("Car(int c) ������ ȣ��");
	}
	public String toString() {
		//int number = 10;
		return this.color + ":" + this.number;
	}
}
public class ThisEx1 {
	public static void main(String[] args) {
		Car c1 = new Car("blue",1234);
		System.out.println(c1);
		Car c2 = new Car("red");
		System.out.println(c2);
		Car c3 = new Car(5678);
		System.out.println(c3);
	}
}
