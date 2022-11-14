package airplane;

import java.util.Random;

public class Airplane {
	
	private Random ran = new Random();
	Human[] arr = new Human[5];
	
	public int entrance(Human c) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = c;
				System.out.println(c.name + " 탑승 완료");
				return 1;
			}
		}
		System.out.println(c.name + " 탑승 불가");
		return 0;
	}
	
	public int emergency() {
		System.out.println();
		int index;
		int cnt = 0;
		do {
			index = ran.nextInt(arr.length);
			if(cnt > 100) {
				System.out.println("탑승객이 없습니다");
				return -1;
			}
			cnt++;
		}while(arr[index] == null);
		
		System.out.println(arr[index].name + " 고객이 급체했습니다");
		return index;
	}
    public void healing() {
	int num = emergency();
	
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] instanceof Doctor  && arr[i] != arr[num]) {
			// Human i가 의사이고 그 의사가 환자가 아닐경우 
			((Doctor)arr[i]).heal(arr[num]);
			// 의사가 환자를 치료한다
			break;
			// 의사가 이미 환자를 치료했으므로 반복종료
		}
		
		
	}
	
	
	
	
}
}
