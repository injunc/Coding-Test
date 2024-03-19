import java.util.*;
import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 큐에 저장
        Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));
        
        // goal 순회
        for(String s : goal){   
            // 큐가 비어있지 않으면 큐에서 문자 비교
            if(!q1.isEmpty()){
                if(q1.peek().equals(s)){
                    q1.poll();
                    continue;
                }
            }
            if(!q2.isEmpty()){
                if(q2.peek().equals(s)){
                    q2.poll();
                    continue;
                }
            }
            return "No";
        }
        
        return "Yes";
    }
}