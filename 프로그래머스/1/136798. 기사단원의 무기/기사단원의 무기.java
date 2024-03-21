import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {      
        int answer =0;
        
        // number 순회
        for(int i=1; i<= number; i++){
            // 약수 배열 반환
            int n = lit(i);
            answer += n>limit?power:n;
        }
        return answer;
}
    
    public int lit(int n){
        if(n== 1) return 1;
        
        Set<Integer> set = new HashSet<>();
        for(int i =1; i<= Math.sqrt(n); i++){
            if(n%i ==0 ){
                set.add(i);
                set.add(n/i);
            }
        }
        return set.size();
    }
}