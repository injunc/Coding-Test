import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // index lastIndex
        int h = -1;
        int t = -1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                h = i;
                break;
            }
        }
        
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == 2){
                t = i;
                break;
            }
        }
        
        // indexOf -1 이면 -1 배열 반환
        if(h == -1) {
            int[] r = {-1};
            return r;
        }
        // lastIndexOf -1이면 2 배열 반환
        if(t == -1){
            int[] r = {2};
            return r;
        }
        
        // 배열 복사 후 반환
        int[] answer = Arrays.copyOfRange(arr, h, t+1);
        return answer;
    }
}