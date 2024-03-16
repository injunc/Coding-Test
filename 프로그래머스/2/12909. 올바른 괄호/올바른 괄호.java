class Solution {
    boolean solution(String s) {
        int sequence =0;
        
        // ( 은 1   ) 은 -1
        //문자열 순회
        for(char c : s.toCharArray()){  
            sequence += c=='('?1:-1;
            
            // 값이 0보다 작으면 false
            if(sequence<0) return false;
        }
        // 값이 0이아니면 false
        return sequence==0?true:false;
    }
}