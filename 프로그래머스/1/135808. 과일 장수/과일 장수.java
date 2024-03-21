import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer =0;
        
        // 내림차순 정렬
        score = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();
        
        // 배열 순회
        int limit = score.length-score.length%m;
        for(int i =0; i<limit; i+=m){
            answer += m*score[i+m-1];
        }
        
        return answer;
    }
}