package chap6;
/*
 * �ΰ��� ������ ������ �����Ͽ� �ո��� 3�� ������ �¸��ϴ� ���α׷� �ۼ��ϱ�
 */
public class CoinEx2 {
	public static void main(String[] args) {
		Coin mycoin = new Coin();
		Coin youcoin = new Coin();
		int mycnt=0,youcnt=0;
		System.out.println("mycoin\tyoucoin");
		while(true) {
			mycoin.flip();
			youcoin.flip();
			if(mycoin.side ==0) {
				System.out.print("�ո�\t");
				mycnt++;
			} else {
				System.out.print("�޸�\t");
				mycnt = 0;
			}
			if(youcoin.side ==0) {
				System.out.println("�ո�\t");
				youcnt++;
			} else {
				System.out.println("�޸�\t");
				youcnt = 0;
			}
			if(mycnt ==3 || youcnt == 3) {
				break;
			}
		}
		if(mycnt > youcnt) System.out.println("mycoin �¸�");
		else if(mycnt < youcnt) System.out.println("youcoin �¸�");
		else System.out.println("���� ���");
		String str = new String("abc");
		str = new String("������");
		mycoin = new Coin();
	}
}

