package management;

import java.util.Scanner;

import model.ComputerScienceStudent;
import model.EnglishLinguisticStudent;
import model.Student;

public class Main {
	
	private static Handler handler = new Handler();
	
	public static void main(String[] args) {
		
		Student st = null;
		Scanner sc = new Scanner(System.in);
		int select, row;
		String name;
		
		System.out.println("\n\t학생 관리 프로그램\n");
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				handler.showList();
				break;
				
			case 2:
				System.out.println("학생 유형을 선택하세요 (1. 영문과 | 2. 컴공과) : ");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1)  st = makeEnglishLinguisticStudent(sc);
				if(select == 2)  st = makeComputerScienceStudent(sc);
				row = handler.insert(st);
				if(row == 1) System.out.println("추가성공");
				if(row == 0) System.out.println("추가실패");
				break;
			case 3:
				System.out.print("검색할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);	// 이름을 전달하여 일치하는 학생을 찾기
				if(st != null)	st.showDetail();
				else 			System.out.println(name + " 학생을 찾을 수 없습니다");
				break;
				
			case 4:
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);				// 이름을 전달받아서, 이름이 일치하는 학생 객체를 반환
				row = handler.delete(st);				// 그 학생을 전달하여 배열에서 제거
				if(row == 1) System.out.println("삭제 성공");
				if(row == 0) System.out.println("삭제 실패");
				break;
			}
		
		} while(select != 0);
		sc.close();
		System.out.println("종료");
	}

	private static Student makeEnglishLinguisticStudent(Scanner sc) {
		String name;
		int kor,eng, mat, literature, translation;
	
		System.out.println("이름 :");
		name = sc.nextLine();
		
		System.out.println("국어 :");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.println("영어 :");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.println("수학 :");
		mat = Integer.parseInt(sc.nextLine());
		
		System.out.println("문학 :");
		literature = Integer.parseInt(sc.nextLine());
		
		System.out.println("번역 :");
		translation = Integer.parseInt(sc.nextLine());
		
		Student s2 = new EnglishLinguisticStudent(name, kor, eng, mat, literature, translation);
		return s2;
	}

	private static Student 	makeComputerScienceStudent(Scanner sc) {
		String name; 
		int kor, eng, mat, java, network, linux;
		
		System.out.println("이름 : ");
		name = sc.nextLine();
		
		System.out.println("국어: ");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.println("영어: ");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.println("수학");
		mat = Integer.parseInt(sc.nextLine());
		
		System.out.println("자바");
		java = Integer.parseInt(sc.nextLine());
		
		System.out.println("네트워크");
		network = Integer.parseInt(sc.nextLine());
		
		System.out.println("리눅스");
		linux = Integer.parseInt(sc.nextLine());
	
		Student s3 = new ComputerScienceStudent(name, kor, eng, mat, java, network, linux);
		
		return s3;
	}
}






