import java.util.*;

class Solution {
    public int solution(int n) {
        
        int[] arr = new int[n+1];
        arr[1] = 1;
        
        for(int i=2; i<arr.length; i++){
            if(arr[i] == 1) continue;
            for(int j = i*2; j<arr.length; j+=i){
                arr[j] = 1;
            }
        }

        long answer = Arrays.stream(arr).filter(m -> m==0).count();
        return (int)answer-1;
    }
}