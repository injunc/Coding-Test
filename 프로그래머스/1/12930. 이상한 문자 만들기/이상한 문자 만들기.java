class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        int index =0;
        
        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            
            if(c ==' '){
                answer += " ";
                index = 0;
            }
            else{
                if(index%2==0) answer += (char)(c-32);
                else answer += c;
                index++;
                }

            }
        
        return answer;
    }
}