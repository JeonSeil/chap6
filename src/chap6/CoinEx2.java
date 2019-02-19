package chap6;
/*
 * 두개의 동전을 던져서 연속하여 앞면이 3번 나오면 승리하는 프로그램 작성하기
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
				System.out.print("앞면\t");
				mycnt++;
			} else {
				System.out.print("뒷면\t");
				mycnt = 0;
			}
			if(youcoin.side ==0) {
				System.out.println("앞면\t");
				youcnt++;
			} else {
				System.out.println("뒷면\t");
				youcnt = 0;
			}
			if(mycnt ==3 || youcnt == 3) {
				break;
			}
		}
		if(mycnt > youcnt) System.out.println("mycoin 승리");
		else if(mycnt < youcnt) System.out.println("youcoin 승리");
		else System.out.println("둘이 비김");
		String str = new String("abc");
		str = new String("가나다");
		mycoin = new Coin();
	}
}

