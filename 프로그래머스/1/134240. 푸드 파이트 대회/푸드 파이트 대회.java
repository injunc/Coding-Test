import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer =  new StringBuilder();
        
        // 배열 순회
        Arrays.setAll(food, n -> (food[n]-food[n]%2)/2);
        
        // sb에 저장하여 반쪽 완성
        for(int i =0; i<food.length; i++){
            for(int j =0; j< food[i]; j++){
                sb.append(i);
            }
        }
        
        answer.append(sb.toString());
        answer.append(0);
        answer.append(sb.reverse().toString());

        return answer.toString();
    }
}