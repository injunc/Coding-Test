import java.util.*;

class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder str = new StringBuilder();
        
        // 매핑 배열 생성
        List<String> nums = new ArrayList<>(Arrays.asList( 
            "zero", "one", "two", "three",
            "four", "five", "six", "seven",
            "eight", "nine"));
        
        // 문자열 순회
        for(char c : s.toCharArray()){  
            // 숫자는 그냥 추가
            if(c <= '9'){
                answer.append(c);
            }else{
                // 문자 하나씩 연결
                str.append(c);
                
                // 문자열이 숫자랑 매핑이 되는지 확인
                int n = nums.indexOf(str.toString());
                if(n == -1) continue;
                answer.append(n+"");
                str.setLength(0);
            }
        }
        return Integer.parseInt(answer.toString());
        }
    }