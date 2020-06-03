package programmers.level2;

public class Top {
	public static void main(String[] args) {
		int[] heights = { 1, 5, 3, 6, 7, 6, 5 };

		Solution3 sol = new Solution3();

		for (int result : sol.solution(heights)) {
			System.out.println(result);
		}
	}
}

class Solution3 {
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];

		for (int i = heights.length - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (heights[i] < heights[j]) {
					answer[i] = j + 1;
					break;
				}
			}
		}

		return answer;
	}
}