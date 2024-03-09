import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        // arr 순회
        for(int i =0; i< arr.length; i++){
            // true면  arr[i]  arr[i]*2번 추가
            if(flag[i]){
                for(int j =0; j< arr[i]*2; j++) stack.push(arr[i]);
            // false면 arr[i]번 제거                
            }else{
                for(int j =0; j< arr[i]; j++) stack.pop();
            }
        }
        
        return stack.stream().mapToInt(i -> i).toArray();
    }
}