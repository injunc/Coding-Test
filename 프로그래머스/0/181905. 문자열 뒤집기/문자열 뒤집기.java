class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        
        String scope = sb.substring(s,e+1);
        StringBuilder answer = new StringBuilder(scope);
        String reverse = answer.reverse().toString();
        
        sb = sb.replace(s, e+1, reverse);
        return sb.toString();
    }
}