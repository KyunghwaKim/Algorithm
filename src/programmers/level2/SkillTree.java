package programmers.level2;

public class SkillTree {
	public static void main(String[] args) {

		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };

		Solution s = new Solution();
		System.out.println(s.solution(skill, skill_trees));
	}
}

class Solution {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		String skillT = "";

		for (int i = 0; i < skill_trees.length; i++) {
			skillT = skill_trees[i].replaceAll("[^" + skill + "]", "");
			if (skillT.length() == 0) answer++;
			else {
				for (int j = 0; j < skillT.length(); j++) {
					if (skillT.charAt(j) != skill.charAt(j)) break;

					if (skillT.length() - 1 == j) answer++;
				}
				
				//if(skill.indexOf(skillT)==0) answer++;
			}
		}

		return answer;
	}
}