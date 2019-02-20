package test;
/*
 2. (1)��(Circle) Ŭ���� ����
    �� ������� :
        ������, ����x��ǥ, ����y��ǥ, ���� ��ȣ no, 
        ���� ��ȣ�� ���������ִ� count (static����)
    �� ��� �޼ҵ�
        a. area : ���� ���̸� ����ϴ� �޼ҵ�. Math.PI ��� ���
        b. length : ���� �ѷ��� ����ϴ� �޼ҵ�. Math.PI ��� ���
        c. toString : ���� �߽����� �������� ����ϴ� �޼ҵ�

    (1)���� Ŭ����(CircleEx) ����
        - �� ��ü���� ������ ����
        - �� ���� ��ȣ, ������, x��ǥ, y��ǥ�� ����ϱ� 
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
	public String toString() {  //������
//		String s = no + "�� ��=>"+ "������:"+r + "(" + x + "," +y + "), ����:"
//	               +area() + ", �ѷ�:" + length();
		return no + "�� ��=>"+ "������:"+r + "(" + x + "," +y + "), ����:"
	               + String.format("%.2f", area()) + ", �ѷ�:" 
		           + String.format("%.2f", length());
/*
  	%.2f : % :������������  .2f : �Ҽ������� 2�ڸ��� ��� ����. �Ҽ������� 3�ڸ����� �ݿø���.
 */
	}
}
public class CircleEx {
	public static void main(String[] args) {
		System.out.printf("%X\n",15); //16���� ���
		System.out.printf("%o\n",15); //8���� ���
		System.out.printf("%3d%3d\n",5,5); //10������ 3�ڸ��� ���

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
