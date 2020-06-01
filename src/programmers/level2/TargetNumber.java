package programmers.level2;

public class TargetNumber {
	int[] numbers;
	int target;
	int answer;

	public int solution(int[] numbers, int target) {
		this.numbers = numbers;
		this.target = target;

		dfs(0, 0);

		return answer;
	}

	public void dfs(int index, int sum) {
		if (index == numbers.length) {
			if (sum == target) {
				answer++;
				return;
			} else
				return;
		} else {
			dfs(index + 1, sum + numbers[index]);
			dfs(index + 1, sum - numbers[index]);
		}
	}
}
