import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        // (l ~ r) 순회
        for(int i =l; i<=r; i++){
            // 문자열로 변환
            String s = i+"";
            // 0 5 를 ""으로 교체
            s = s.replaceAll("5", "");
            s = s.replaceAll("0", "");
            // "" 값만 남았다면 저장
            if(s.equals("")) answer.add(i);
        }
        if(answer.size()<1){
            int[] re = {-1};
            return re;
        }
        
        return answer.stream().mapToInt(a->a).toArray();
    }
}