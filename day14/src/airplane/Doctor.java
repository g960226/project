package airplane;

public class Doctor extends Human {
	void heal(Human other) {
		System.out.printf("%s가 %s를 치료하고 있습니다",name, other.name);
	}
	Doctor(String name, String job) {
		super(name, job);
	}
	@Override
	public void show() {
		System.out.printf("이름 : %s , 직업 : %s", name, job);
	}
}
