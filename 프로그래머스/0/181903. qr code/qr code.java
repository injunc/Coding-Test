class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        // string code loop
        for(int i=0; i< code.length(); i++){
            // if i%q  == r : + code[i]
            if(i%q == r) answer += code.charAt(i);
        }
        return answer;
    }
}