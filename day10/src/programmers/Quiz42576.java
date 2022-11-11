package programmers;

import java.util.Arrays;

public class Quiz42576 {
	static String solution(String[] participant, String[] completion) {

		String answer = "";
		// 문자열의 배열을 정렬한다
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (String p : participant) {	// String p는 배열 하나하나 하기
			System.out.print(p + " ");
		}
		System.out.println();

		for (String c : completion) {
			System.out.print(c + " ");
		}
		System.out.println();
		// 어차피 정답은 마지막 참가자

		for (int i = 0; i < completion.length; i++) { // 완주자의 목록을 순서대로 조회하면서
			if (completion[i].compareTo(participant[i]) == 0) {
				answer = participant[participant.length - 1];
			} // 만약 참가자가 완주자가 아니라면,
			else {
				answer = participant[i];
				break;
			} // 그 참가자가 정답이다. (완주하지 못한 선수)
				// 정답을 찾았으니, 반복을 중단한다
		}
		return answer;
	}

	public static void main(String[] args) {

		String[] p1 = { "leo", "kiki", "eden" };
		String[] c1 = { "eden", "kiki" };

		String[] p2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] c2 = { "josipa", "filipa", "marina", "nikola" };

		String[] p3 = { "mislav", "stanko", "mislav", "ana" };
		String[] c3 = { "stanko", "ana", "mislav" };

		System.out.println(solution(p1, c1).equals("leo"));
		System.out.println(solution(p2, c2).equals("vinko"));
		System.out.println(solution(p3, c3).equals("mislav"));

	}
}
