import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int index =0;
        
        // 배열 전부 -1로 채우기
        Arrays.fill(answer, -1);     
        
        Set<Integer> set = new HashSet<>();
        // arr 순회
        for(int n : arr){
            // 값이 set에 있으면 다음 요소 검색    
            if(set.contains(n)) continue;
            
            // 없으면 set에 등록, 배열에 추가
            if(index == answer.length) break;
            answer[index++] = n;
            set.add(n);
        }
        return answer;
    }
}