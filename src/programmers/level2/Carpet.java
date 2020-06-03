package programmers.level2;

public class Carpet {
    int area = 0;
    int x = 2;
    int y = 2;
    boolean isReturn = false;
    public int[] solution(int brown, int yellow) {
        
        area = brown + yellow;
        while(!isReturn) {
        	result(x,y);
        }
        int[] answer = {x,y};
        
        return answer;
    }
    
    void result(int x, int y){
        if(x*y == area){
            isReturn = true;
        }
        else {
            if(x*y > area){
                x++;
                y = 1;
            }
            else {
                y++;
            }
        }
    }
}
