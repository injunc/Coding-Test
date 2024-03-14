import java.util.*;

class Solution {
    public static int solution(String t, String p) {
        StringBuilder sb = new StringBuilder(t);
        int answer = 0;

        for(int i=0; i<=t.length()-p.length(); i++){
            String str = sb.substring(i, i+p.length());
            
            long n = Long.parseLong(str);
            if(Long.parseLong(p) >= n) answer++;
            
            
        }
        
        return answer;
	}
}