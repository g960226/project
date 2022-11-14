package airplane;

public class Human {
	String name;
	String job;
	
	
	Human(String name, String job) {
		this.name = name;
		this.job = job;
		}
	
	void show() {
		System.out.printf("이름 : %s , 직업 : %s", name, job);
	}	// 오버라이딩하세요
}
