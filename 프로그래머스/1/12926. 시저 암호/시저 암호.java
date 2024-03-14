class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        // 문자 순회
        for(char c : s.toCharArray()){
            // 공백 무시
            if(c == ' ') answer.append(c);
            else{
                // 문자 + n / 26
                int ch = (c+n);
                if(c >= 97) ch = ch>'z'?(ch+'a'-'z'-1):ch;
                else ch = ch>'Z'?(ch+'A'-'Z'-1):ch;
                answer.append((char)ch);
            }
		}
        return answer.toString();
    }
}