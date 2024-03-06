import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        //문자 배열로 변환
        char[] arr = my_string.toCharArray();
        
        //배열 순회
        for(int[] q : queries){
                
            // 앞에 문자열 생성
            String head = my_string.substring(0, q[0]);
           
            // 뒤에 문자열 생성
            int h = Math.min(q[1]+1, my_string.length());
            String tail = my_string.substring(h, my_string.length());
        
            //뒤집는  문자열 생성
            char[] rv = Arrays.copyOfRange(arr, q[0],q[1]+1);

            // 배열 역순으로 저장
            String bef = "";
            String aft = "";
            for(char c: rv) bef+=c;            
            for(int i=bef.length()-1; i>=0; i--) aft+=rv[i];
            
            // 문자열 완성
            my_string = head + aft + tail;

            arr = my_string.toCharArray();
        }
            
        return my_string;
    }
}