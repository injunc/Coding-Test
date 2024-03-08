import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer,Integer>map = new HashMap<>();
        
        // 배열 순회
        for(String s : strArr){
            // 크기별로 맵에 저장 및 카운트
            int n = s.length();
            map.put(n, map.getOrDefault(n, 0)+1);    
            // 가장 큰 값 저장
            answer = Math.max(answer, map.get(n));
        }
        return answer;
    }
}