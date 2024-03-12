class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        sb = sb.delete(s, s+overwrite_string.length());
        sb = sb.insert(s, overwrite_string);

        return sb.toString();
    }
}