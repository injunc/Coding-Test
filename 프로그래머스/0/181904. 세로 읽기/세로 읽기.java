class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i =c-1; i<my_string.length(); i+=m){
            answer+= arr[i];
        }
        return answer;
    }
}