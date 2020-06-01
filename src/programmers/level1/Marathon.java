package programmers.level1;

import java.util.Arrays;

public class Marathon {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		// 알파벳순 정렬
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < participant.length; i++) {
			if (i == completion.length) {
				answer = participant[i];
			} else if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] a = {"mislav", "stanko", "mislav", "ana"};
		String[] b = {"stanko", "ana", "mislav"};
		System.out.println(solution(a, b));
	}
}
