import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        // 반복
        
        boolean find = false;
        
        while(!find){
            // 횟수 카운트
            answer++;
            
            // 배열 복사
            int[] cp = Arrays.copyOfRange(arr, 0, arr.length);
            
            //배열 순회
            for(int i=0;i<arr.length;i++){
                // 짝수가 50이상이면 /2
                if(cp[i] >= 50 && cp[i]%2==0){
                    cp[i] /= 2;
                // 홀수가 50 미만이면 *2+1
                }else if(cp[i]<50 && cp[i]%2!=0){
                    cp[i] = cp[i]*2+1;
                }
            }
            
            int count =0;
            for(int i=0; i<cp.length; i++){
                if(cp[i] == arr[i]) count++;
            }
            if(count == cp.length) find = true;
            
            arr = Arrays.copyOfRange(cp, 0, cp.length);
        }
        return answer-1;
    }
}