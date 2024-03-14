class Solution {
    public String solution(String s, int n) {
        // 48
        // 65
        // 97
        String answer = "";
        
        // System.out.println((int)'z'); // 122
       // System.out.println((int)'Z'); // 90
        // 문자 순회
        for(char c : s.toCharArray()){
            // 공백 무시
            if(c == ' ') answer+=c;
            else{
                // 문자 + n / 26
                int ch = (c+n);
                if(c >= 97){
                    ch = ch>'z'?(ch+'a'-'z'-1):ch;
                }else{
                    ch = ch>'Z'?(ch+'A'-'Z'-1):ch;
                }
                answer += (char)ch;
            }
		}
        return answer;
    }
}