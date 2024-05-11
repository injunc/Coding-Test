import java.util.*;

class Solution {
    
    Map<String, Integer> item;
    
    public int solution(String[] want, int[] number, String[] discount) {
        item = new HashMap<>();
        int answer = 0;
        
        for(int i =0; i< want.length; i++){
            item.put(want[i], number[i]);
        }
        
        int first = 0;
        int last = 9;
        
        Set<String> keys = item.keySet();
        
        // 시작일 0일떄 세팅
        for(int i= 0; i<= last; i++){
            String s = discount[i];
            if(!keys.contains(s)) continue;
            item.put(s, item.get(s)-1);
        }
        if(all(want)) answer++;
        
        // 할일 마지막까지 반복
        while(last < discount.length-1){
            
            if(keys.contains(discount[first])){
                // 시작일 이동 + 물품 제거
                item.put(discount[first], item.get(discount[first])+1);
            }
            
            first++;
            last++;
            
            if(keys.contains(discount[last])){
                item.put(discount[last], item.get(discount[last])-1);
            }

            if(all(want)) answer++;
        }
        return answer;
    }
    
    public boolean all(String[] srr){
        for(String s : srr){
            if(item.get(s) != 0) return false;
        }
        return true;
    }
    
}

