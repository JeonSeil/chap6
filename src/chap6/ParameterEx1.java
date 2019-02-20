package chap6;
/*
 * 매개변수 예제
 *   기본형 매개변수 : 조회만 가능
 *                 값이 복사되어 호출되기때문에 원래 객체의 값을 보전된다.
 *   참조형 매개변수 : 조회와 변경 가능
 *                 참조값이 복사되기 때문에 원래의 객체값이 변경 될 수 있다.
 */
class ParamVal {
	int val;
}
public class ParameterEx1 {
	public static void main(String[] args) {
		ParamVal pv = new ParamVal();
		pv.val = 100;
		change1(pv.val);
		System.out.println("main=> change1() 이후 :" + pv.val); //100
		change2(pv);
		System.out.println("main=> change2() 이후 :" + pv.val); //200
	}
	private static void change1(int val) {
		val += 100;
		System.out.println("change1(): val=" + val); //200
	}
	private static void change2(ParamVal pv) {
		pv.val += 100;
		System.out.println("change1(): val=" + pv.val); //200
	}
}
