package chap6;
/*
 * �Ű����� ����
 *   �⺻�� �Ű����� : ��ȸ�� ����
 *                 ���� ����Ǿ� ȣ��Ǳ⶧���� ���� ��ü�� ���� �����ȴ�.
 *   ������ �Ű����� : ��ȸ�� ���� ����
 *                 �������� ����Ǳ� ������ ������ ��ü���� ���� �� �� �ִ�.
 */
class ParamVal {
	int val;
}
public class ParameterEx1 {
	public static void main(String[] args) {
		ParamVal pv = new ParamVal();
		pv.val = 100;
		change1(pv.val);
		System.out.println("main=> change1() ���� :" + pv.val); //100
		change2(pv);
		System.out.println("main=> change2() ���� :" + pv.val); //200
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
