import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        //  k배 크기 배열
        String[] answer = new String[picture.length*k];
        int index =0;
        
        // picture 배열 순회
        for(String s : picture){
            String str = "";
            
            for(char c : s.toCharArray()){
                for(int i=0; i<k; i++){
                    str += c;
                }
            }
            
            // 배열 k번 저장
            for(int y=0; y<k; y++){
                answer[index++] = str;
            }

            }
        return answer;
    }
}