package chap6;
/*
 * �簢�� Ŭ���� 3���� �����ϱ�
 * 1���簢�� : ���� 10, ���� 10�� �簢��
 * 2���簢�� : ���� 5, ���� 20�� �簢��
 * 3�� �簢��: ���� 15, ���� 2�� �簢��
 * �� �����Ͽ�, ���� �簢���� ���̿� �ѷ��� ���ϴ� ���α׷� �ۼ��ϱ�
 * 
 * 
 */
class Rectangle {
	int width, height,serialno; //�ν��Ͻ� ���� 
	static int cnt; //Ŭ��������
	void area() {
		System.out.println(serialno + "�� �簢���� ����:"+ width*height);
	}
	void length() {
		System.out.println(serialno + "�� �簢���� �ѷ�:"+ (width+height)*2);
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
				System.out.println(r.serialno + "�� �簢���� ���簢�� �Դϴ�.");
			} else {
				System.out.println(r.serialno + "�� �簢���� ���簢�� �Դϴ�.");
			}
		}		
	}
}
