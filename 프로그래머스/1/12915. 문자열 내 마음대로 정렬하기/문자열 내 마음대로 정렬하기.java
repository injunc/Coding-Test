import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        final int f = n;
        
        Comparator<String> cp  = new Comparator<String>(){
            
            @Override
            public int compare(String o1, String o2){
                int flag  = o2.charAt(f) - o1.charAt(f);
                
                if(flag < 0) return 1;
                if(flag ==0){
                    return o1.compareTo(o2);
                }
                return -1;
            }
        };

        Arrays.sort(strings, cp);
       
        return strings;
    }
}