import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        // (l ~ r) 순회
        for(int i =l; i<=r; i++){
            // 문자열로 변환
            String s = i+"";
            if(s.charAt(s.length()-1) != '0' && s.charAt(s.length()-1) != '5') continue;
            
            // 0 5 를 ""으로 교체
            s = s.replaceAll("5", "");
            s = s.replaceAll("0", "");
            // "" 값만 남았다면 저장
            if(s.equals("")) answer.add(i);
        }
        
        return answer.size()>0?answer.stream().mapToInt(a->a).toArray():new int[]{-1};
    }
}
