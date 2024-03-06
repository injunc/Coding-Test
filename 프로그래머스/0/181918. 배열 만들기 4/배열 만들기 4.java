import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        // stk를 스택으로 생성
        Stack<Integer> stk = new Stack<>();
        
        int index =0;
        // arr 마지막 인덱스로 갈때까지 반복
        while(index<arr.length){
            //stk가 비거나 작으면 arr요소 추가, 인덱스 이동
            if(stk.isEmpty() || stk.peek() < arr[index]){
                stk.push(arr[index++]);
            }
            //stk가 크면 제거
            else if(stk.peek() >= arr[index]){
                stk.pop();
            }           
        }
        
        // 배열 변환
        int[]answer = new int[stk.size()];
        int ai = 0;
        
        for(int n : stk){
            answer[ai++] = n;
        }
        return answer;
    }
}