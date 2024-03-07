class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        // 문자열 순회  
        for(char c : my_string.toCharArray()){   
            // 대문자 -65 소문자 -97+26  인덱스  위치에 값 카운트
            if(c > 96){
                answer[c-97+26]++;
            }else{
                answer[c-65]++;
            }
        }
        return answer;
    }
}