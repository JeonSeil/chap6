package test;
/*
����Ŭ����(Animal) �����ϱ�
      ������� : �̸�(name), ����(age)
     ����޼���: eat() 
         ��� :" ���ְ� ��� "  �����
         
    ����Ŭ����(AnimalTest.java) �����ϱ�
    main �޼��忡�� �����
    [���]
  ������:26��
  ���ְ� ���
 */
class Animal {
	String name;
	int age;
	void eat() {
		System.out.println("���ְ� ���");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "������";
		a.age = 26;
		System.out.println(a.name +":" + a.age + "��");
		a.eat();
	}
}
