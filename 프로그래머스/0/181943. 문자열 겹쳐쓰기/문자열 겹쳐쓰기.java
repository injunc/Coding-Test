class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        // my_string s-1까지 자르기
        String s1 = my_string.substring(0 , s);
        
        // my_string s+overwirte 길이 까지 자르기
        String s2 = my_string.substring(s+overwrite_string.length() , my_string.length());
        // 합치기
        
       
        return s1 + overwrite_string + s2;
    }
}