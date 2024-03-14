import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character,Integer> map = new HashMap<>();
        
        //  문자열 순회
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, i);
                answer[i] =-1;
            }
            // 맵에서 전에 거리가 있다면 인덱스-전거리
            // 맵에 인덱스 업데이트
            else{
                answer[i] =i - map.get(c);
                map.put(c, i);
            }
        }
        return answer;
    }
}