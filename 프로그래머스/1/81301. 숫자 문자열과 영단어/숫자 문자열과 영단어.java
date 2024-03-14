import java.util.*;

class Solution {
    public int solution(String s) {
        //매핑 배열 생성
        StringBuilder sb = new StringBuilder(s);
        List<String> nums = new ArrayList<>(Arrays.asList( 
            "zero", "one", "two", "three",
            "four", "five", "six", "seven",
            "eight", "nine"));

        String answer ="";
        String str ="";
        
        // 문자열 순회
        for(char c : s.toCharArray()){  

            if(c <= '9'){
                // 숫자가 나오면 그대로 추가
                int n = nums.indexOf(str);
                if(n != -1) answer+= n;
                answer += c;
                str ="";
                continue;
            } else{
                str += c;        
            }
            
            int n = nums.indexOf(str);
            if(n != -1){ 
                answer+= n;
                str ="";
                }
            }
        
        return Integer.parseInt(answer);
        }
    }