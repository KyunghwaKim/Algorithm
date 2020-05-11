package programmers.level1;

public class GcdLcm {
	public int[] solution(int n, int m) {
        int[] answer = {0,0};
        int temp = 0;
        int multi = n*m;

        if(n > m) {
            temp = n;
            n = m;
            m = temp;
        }

        while(true) {
            if(m%n == 0) {
                answer[0] = n;
                answer[1] = multi/n;
                break;
            }else {
                temp = n;
                n = m%n;
                m = temp;
            }
        }
        return answer;
    }
}
