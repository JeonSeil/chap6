package chap6;
/*
 * 구동 클래스가 실행이 되도록 Coin클래스 구현하기
 */
class Coin {
	int side;
	void flip() {
		/*
		 *  0 <= Math.random() < 1.0
		 *  0 <= Math.random() * 2 < 2.0
		 *  0 <= (int)(Math.random() * 2) < 2
		 */
		side = (int)(Math.random()*2);
	}
}
public class CoinEx1 {
	public static void main(String[] args) {
		Coin coin = new Coin();
		coin.flip();
		switch(coin.side) {
			case 0: System.out.println("앞면");break;
			case 1: System.out.println("뒷면");break;
		}
	}
}