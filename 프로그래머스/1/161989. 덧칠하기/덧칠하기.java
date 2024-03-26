import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] arr = new int[n+1];
        
        // 색칠한 인덱스
        int index = 0;
        
        // section 순회
        for(int l : section){
            // 인덱스 보다 요소 위치가 뒤면
            if(index < l){
                // 횟수 증가
                answer++;
                // 인덱스 업데이트
                index = l+m-1;
                if(index >= n) break;
            }
        }
        
        return answer;
    }
}