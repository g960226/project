package oop;
	
class Test2 {
	int num;
	// 기본 생성자
	Test2() {
		this(0); 
		// 생성자에서 또다른 생성자를 호출 // 첫번째 줄이어야 함
		// Constructor call must be the first statement in a constructor
		// 1) 객체의 생성 ( 생성이 완료되지 않으면, 추가작업을 진행할 수 없다)
		// 2) 객체의 생성 이후 초기값 할당 및 추가 작업 진행
		System.out.println("기본 생성자 호출 !!");
	}
	
	Test2(int num) {
		this.num = num;
		System.out.println("int를 전달받는 생성자 호출 !!");
	}
}
public class Ex05 {
	public static void main(String[] args) {
		Test2 ob1 = new Test2();
		Test2 ob2 = new Test2(12);
		
		System.out.println(ob1.num);
		System.out.println(ob2.num);
	}
}
