package programmers.level2;

public class MakeBigNumber {
	public String solution(String number, int k) {
		String answer = "";
		int no = 0;

		while (k > 0) {
			if (Double.parseDouble(number.substring(no, no)) < Double.parseDouble(number.substring(no + 1, no + 1))) {
				number = number.substring(0, no - 1) + number.substring(no + 1);
				k -= 1;
			} else {
				no++;
			}
		}
		answer = number;

		return answer;
	}
}
