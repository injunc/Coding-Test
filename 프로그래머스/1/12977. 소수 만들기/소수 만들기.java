import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int l = nums.length;
        
        for(int a =0; a<l-2; a++){
            for(int b=a+1; b<l-1; b++){
                for(int c=b+1; c<l; c++){
                    if(odd(nums[a]+nums[b]+nums[c])) answer++;
                }
            }
        }
        return answer;
    }
    
    public boolean odd(int n){
        if(n%2 ==0) return false;
        int count =0;
        
        for(int i =1; i<= Math.sqrt(n); i++){
            if(n%i ==0){
                count += Math.sqrt(n) == n/i?1:2;
            }
            if(count > 2) return false;
        }
        return true;
    }
}