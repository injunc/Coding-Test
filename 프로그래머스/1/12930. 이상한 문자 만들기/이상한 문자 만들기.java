class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        s = s.toLowerCase();
        int index =0;
        
        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            
            if(c ==' '){
                answer.append(" ");
                index = 0;
            }
            else{
                if(index++%2==0) answer.append((char)(c-32));
                else answer.append(c);
                }
            }
        
        return answer.toString();
    }
}