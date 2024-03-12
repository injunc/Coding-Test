import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        for(int i=0; i<query.length; i++){
            int n = query[i];
            if(i%2==0){
                // 짝수면  n 번 인덱스 뒷부분 삭제
                arr = Arrays.copyOfRange(arr, 0, n+1);        
            }else{
                // 홀수면 n 번 인덱스 앞부분 삭제
                arr = Arrays.copyOfRange(arr, n, arr.length);
            }
        }
        return arr;
    }
}