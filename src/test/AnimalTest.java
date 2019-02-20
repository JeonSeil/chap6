package test;
/*
동물클래스(Animal) 구현하기
      멤버변수 : 이름(name), 나이(age)
     멤버메서드: eat() 
         기능 :" 맛있게 얌얌 "  출력함
         
    구동클래스(AnimalTest.java) 구현하기
    main 메서드에서 결과가
    [결과]
  원숭이:26살
  맛있게 얌얌
 */
class Animal {
	String name;
	int age;
	void eat() {
		System.out.println("맛있게 얌얌");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "원숭이";
		a.age = 26;
		System.out.println(a.name +":" + a.age + "살");
		a.eat();
	}
}
