import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer =0;
        
        // 배열 순회
        for(String s : babbling){
            // 겹치는게 있으면 실패
            if(s.indexOf("ayaaya") != -1) continue;
            if(s.indexOf("yeye") != -1) continue;
            if(s.indexOf("woowoo") != -1) continue;
            if(s.indexOf("mama") != -1) continue;

            // 문자 교체해서 제거
            s =s.replaceAll("aya", "@");
            s =s.replaceAll("ye", "@");
            s =s.replaceAll("woo", "@");
            s =s.replaceAll("ma", "@");
            s =s.replaceAll("@", "");
            
            if(s.equals("")) answer++;
        }   
        return answer;
      

  }

}