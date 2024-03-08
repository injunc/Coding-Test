import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        //  use stack
        Stack<Integer> stk = new Stack<>();
        
        // loop arr
        for(int i=0; i<arr.length; i++){
            // if empty | peek != arr : add i
            if(stk.isEmpty() || stk.peek() != arr[i]) stk.add(arr[i]);
            else if(stk.peek() ==arr[i]) stk.pop();
            // else if arr == peek : pop 
        }
        
        int[]ar = {-1};
        if(stk.size() < 1) return ar;
        
        // convert stack to array
        return stk.stream().mapToInt(a->a).toArray();
    }
}