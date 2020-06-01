package programmers.level2;

public class LandGame {

	public static void main(String[] args) {
		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };

		Solution2 sol = new Solution2();
		System.out.println(sol.solution(land));
	}
}

class Solution2 {
	int sumMethod(int target, int[][] land) {
		int result = 0;
		int[] first = new int[land.length];
		int location = 0;

		for (int i = 1; i < land.length; i++) {
			for (int j = 0; j < land[i].length; j++) {
				if (j != target && first[i] < land[i][j]) {
					first[i] = land[i][j];
					if (i == 1)
						location = j;
					else
						target = j;
				}

				if (i == 1 && j == land[i].length - 1)
					target = location;
			}
			result += first[i];
		}
		return result;
	}

	int solution(int[][] land) {
		int answer = 0;
		int result = 0;

		for (int i = 0; i < land[0].length; i++) {
			result = sumMethod(i, land);
			result += land[0][i];
			if (answer < result) {
				answer = result;
			}
		}

		return answer;
	}
}

//class Solution {
//	int solution(int[][] land) {
//		int answer = 0;
//		int[] first = new int[land.length];
//		int[] second = new int[land.length];
////		int[] gap = new int[land.length];
//		int sumNum = 0;
//		
//		int[] realLocation = new int[land.length];
//		int[] secondLocation = new int[land.length];
//
//		for (int i = 0; i < land.length; i++) {
//			for (int j = 0; j < land[i].length; j++) {
//				if (i == 0 || j != realLocation[i-1]) {
//					if (first[i] < land[i][j]) {
//						if(second[i] < first[i]) {
//							second[i] = first[i];
//						}
//						first[i] = land[i][j];
//						
//						secondLocation[i] = realLocation[i];
//						realLocation[i] = j;
//					}
//				} else {
//					second[i] = land[i][j];
//				}
//			}
//			
////			gap[i] = first[i] - second[i];
////			
////			if(i!=0 && gap[i]<0 && Math.abs(gap[i])>gap[i-1]) {
////				int temp = first[i-1];
////				first[i-1] = second[i-1];
////				second[i-1] = temp;
////				
////				temp = first[i];
////				first[i] = second[i];
////				second[i] = temp;
////				
////				realLocation[i] = realLocation[i-1];
////				realLocation[i-1] = secondLocation[i-1];
////			}
//		}
//
//		for (int num : first) {
//			answer += num;
//		}
//		
//		for(int num : second) {
//			sumNum += num;
//		}
//
//		if(sumNum > answer) answer = sumNum;
//		
//		return answer;
//	}
//}
