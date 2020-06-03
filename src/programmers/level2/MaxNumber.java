package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class MaxNumber {
	public static void main(String[] args) {

		int[] numbers = { 99990, 31, 90999, 3, 9999, 30, 34, 5, 9 };

		Solution4 s = new Solution4();
		System.out.println(s.solution(numbers));
	}
}

class Solution4 {
	public String solution(int[] numbers) {
		String answer = "";
		List<String> list = new ArrayList<String>();
		
		String temp = "";

		for (int num : numbers) {
			list.add(Integer.toString(num));
		}
		
		while (list.size() > 0) {
			
			for (int i = list.size() - 1; i > 0; i--) {
				
				if (list.get(i - 1).length() < list.get(i).length()) {
					
					for (int j = 0; j < list.get(i).length(); j++) {
						
						if (list.get(i - 1).length() > j && list.get(i).charAt(j) - 0 > list.get(i - 1).charAt(j) - 0) {
							
							temp = list.get(i);
							list.set(i, list.get(i - 1));
							list.set(i - 1, temp);
							break;
							
						} else if(list.get(i - 1).length() <= j
								&& list.get(i).charAt(j) - 0 > list.get(i - 1).charAt(list.get(i - 1).length() - 1) - 0
								|| j == list.get(i).length() - 1
								&& list.get(i).charAt(j) - 0 == list.get(i - 1).charAt(list.get(i - 1).length() - 1) - 0) {
							
							temp = list.get(i);
							list.set(i, list.get(i - 1));
							list.set(i - 1, temp);
							break;
							
						} else if(list.get(i - 1).length() > j && list.get(i).charAt(j) - 0 < list.get(i - 1).charAt(j) - 0
								|| list.get(i - 1).length() <= j
								&& list.get(i).charAt(j) - 0 < list.get(i - 1).charAt(list.get(i - 1).length() - 1) - 0) {
							break;
						}
					}
					
				} else {
					
					for (int j = 0; j < list.get(i - 1).length(); j++) {
						
						if (list.get(i).length() > j && list.get(i).charAt(j) - 0 > list.get(i - 1).charAt(j) - 0) {
							
							temp = list.get(i);
							list.set(i, list.get(i - 1));
							list.set(i - 1, temp);
							break;
							
						}
						else if(list.get(i).length() <= j 
								&& list.get(i).charAt(list.get(i).length() - 1) - 0 > list.get(i - 1).charAt(j) - 0) {
							
							temp = list.get(i);
							list.set(i, list.get(i - 1));
							list.set(i - 1, temp);
							break;
							
						} else if(list.get(i).length() > j && list.get(i).charAt(j) - 0 < list.get(i - 1).charAt(j) - 0
								|| list.get(i).length() <= j 
								&& list.get(i).charAt(list.get(i).length() - 1) - 0 < list.get(i - 1).charAt(j) - 0) {
							break;
						}
					}
					
				}

			}
			answer += list.get(0);
			list.remove(0);
		}

		return answer;
	}
}
