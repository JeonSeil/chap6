package chap6;
/*
 * Ŭ���� ����, �ν��Ͻ� ���� ���� : ����Ǵ� ��ġ�� Ŭ���� ���ο� �����
 * 
 * Ŭ�������� :     ������ : static �ڷ��� ������
 *           �޸��Ҵ���ġ : Ŭ���� ����
 *           �޸��Ҵ�ñ� : Ŭ���� ���� �ε��
 *           Ư¡ : 1. ��üȭ �ʿ� ����.
 *                 2.��� ��ü�� ���뺯���� ����.
 *           ���� : Ŭ������.������.     
 * 
 * �ν��Ͻ����� :    ������ : �ڷ��� ������
 * (��ü����)  �޸��Ҵ���ġ : �� ����
 *           �޸��Ҵ�ñ� : ��üȭ ��
 *           Ư¡ : 1. �ݵ�� ��üȭ�� �ʿ���. 
 *                 2. ��ü���� �ٸ� �޸� ������ ����
 *           ���� : ����������.������.     
 */
class Card {
	String type;  //�ν��Ͻ�����
	int number;   //�ν��Ͻ�����
	static int width = 150;  //Ŭ��������
	static int height = 250; //Ŭ��������
	//��ü�� ���ڿ�ȭ�ϴ� �޼���. ���������̸��� ����ϸ� �ڵ� ȣ��Ǵ� �޼���
	public String toString() {
		return type + ":" + number + "(" + width+"," + height + ")";
	}
}
public class CardEx1 {
	public static void main(String[] args) {
		System.out.println("Card�� ũ�� :" + Card.width + "," + Card.height);
		//�����߻�. �ν��Ͻ� ������ ��üȭ �Ǿ�� ����� ������
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
