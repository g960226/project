package management;

import model.Student;

public class Handler {
	
	private Student[] arr = new Student[10];	// Student 자료형의 배열이니까 Student안에 메서드를 사용 가능

	public void showList() {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].showInfo();
				
			}
		}
	}

	public int insert(Student s) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = s;
				return 1;
			}
		}
		
		return 0;
	}
	

	public Student find(String name) {				// 배열을 다룰 때에는 배열의 자료형을 확인하고 진행하자
		for(int i = 0; i < arr.length; i++) {		// 학생의 배열이므로, 각 배열의 칸(arr[i]) 에는 학생 객체가 담길 수 있다
			if(arr[i] != null && arr[i].getName().contains(name)) {    // 빈칸이 아닌곳의 학생의 이름이 전달받은 이름과 일치하면
				arr[i].showInfo();
				return arr[i]; // 그 학생객체를 반환한다
			}
			
		}
		return null;
	}
	
	

	public int delete(Student st) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getName().equals(st.getName())) {		// == 연산자는 NullPointerException으 발생시킬 
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}

	
	
	
	
	
	
	
	
	
	
	// 추가
	// 목록
	// 삭제
	// 검색

}
