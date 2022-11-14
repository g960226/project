package airplane;

import animalHospital.Cat;
import animalHospital.Dog;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		Human d1 = new Doctor("문상민", "의사");
		Human d2 = new Doctor("김도영", "의사");
		Human d3 = new Singer("박해일", "의사");
		Human s1 = new Singer("문빈", "가수");
		Human s2 = new Singer("정재현", "가수");
		Human s3 = new Singer("차은우", "가수");
		// Human의 서브클래스는 여러개를 만들어도 됩니다
		// 이때, 최소 2명의 의사를 포함시킵니다
		
		air.entrance(d1);
		air.entrance(d2);
		air.entrance(d3);
		air.entrance(s1);
		air.entrance(s2);
		air.entrance(s3);
		
		
		
		
		// 비행기 내부에서 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요
		air.healing();
		
	}
}
